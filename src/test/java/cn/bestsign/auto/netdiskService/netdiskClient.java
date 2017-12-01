package cn.bestsign.auto.netdiskService;

import cn.bestsign.auto.netdiskService.thrift.proto.CloudHardDiskService;
import cn.bestsign.auto.netdiskService.thrift.proto.LoginResult;
import com.alibaba.fastjson.JSONObject;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class netdiskClient {

    private  CloudHardDiskService.Client netdiskService;
    private TBinaryProtocol protocol;
    private TSocket transport ;
    public CloudHardDiskService.Client getLoginAuthService() {
        return netdiskService;
    }

    public  void  open() throws TTransportException {
        transport.open();
    }
    public  void  close()
    {
        transport.close();
    }
    public   netdiskClient() throws TTransportException {
        transport = new TSocket("localhost",9090);
        protocol = new TBinaryProtocol(transport);

        TMultiplexedProtocol mp2 = new TMultiplexedProtocol(protocol, CloudHardDiskService.class.getSimpleName());
        netdiskService = new CloudHardDiskService.Client(mp2);
    }

    public   netdiskClient(String url) throws TException {

        url = "http://221.7.13.207:8080/chdserver.php";
        TTransport client = new THttpClient(url);

        client.open();
        protocol = new TBinaryProtocol(client);
        netdiskService = new CloudHardDiskService.Client(protocol);
        LoginResult loginResult = netdiskService.loginAuth("13989497004", "123456", "112");
        System.out.println(JSONObject.toJSONString(loginResult));
    }

    public static void main(String arge []) throws TException {


//        netdiskClient client = new netdiskClient();
//        client.open();
//        LoginResult loginResult = client.getLoginAuthService().loginAuth("13989497004", "123456", "12");
//        System.out.println(JSONObject.toJSONString(loginResult));
//        System.out.println(loginResult.getResult().ret);
//        client.close();

        netdiskClient client = new netdiskClient("11");
    }
}
