package cn.bestsign.auto.netdiskService;

import cn.bestsign.auto.netdiskService.thrift.netdiskServiceImpl;
import cn.bestsign.auto.netdiskService.thrift.proto.CloudHardDiskService;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetdiskServiceApplication {

	private static void startRPCServer()
	{
		try {
			// 设置协议工厂为 TBinaryProtocol.Factory
			TBinaryProtocol.Factory proFactory = new TBinaryProtocol.Factory();
			// 关联处理器与 Hello 服务的实现
			TMultiplexedProcessor processor = new TMultiplexedProcessor();
			TServerTransport t = new TServerSocket(9090);
			TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(t).processor(processor));
			processor.registerProcessor(CloudHardDiskService.class.getSimpleName(),
                    new CloudHardDiskService.Processor<CloudHardDiskService.Iface>(
                            new netdiskServiceImpl()));
//         TSimpleServer server = new TSimpleServer(new Args(t).processor(processor));
			System.out.println("the serveris started and is listening at 9090...");
			server.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(NetdiskServiceApplication.class, args);
        startRPCServer();
	}
}
