package cn.bestsign.auto.netdiskService.thrift;

import cn.bestsign.auto.netdiskService.thrift.proto.*;
import org.apache.thrift.TException;

import java.nio.ByteBuffer;
import java.util.Map;

public class netdiskServiceImpl implements CloudHardDiskService.Iface {
    @Override
    public LoginResult loginAuthApp(String imie, String username, String password, int salt) throws TException {
        return null;
    }

    @Override
    public LoginResult loginAuth(String username, String password, String salt) throws TException {
        RetHead retHead = new RetHead();
        retHead.setMsg("login test");
        retHead.setRet(Errcode.SUCCESS);

        LoginResult result = new LoginResult();
        result.setResult(retHead);
        result.setUserid(1);
        return result;
    }

    @Override
    public LoginResult verificationLoginAuth(String username, String password, String authcode) throws TException {
        return null;
    }

    @Override
    public UploaddResult uploadFile(String token, UploadParam uploadparam) throws TException {
        return null;
    }

    @Override
    public QueryFListResult queryFileList(String token, FTYPE type, int start, int excpet_num) throws TException {
        return null;
    }

    @Override
    public QueryFResult QueryFile(String token, FTYPE type, String fname) throws TException {
        return null;
    }

    @Override
    public QueryAttributeResult queryAttribute(String token, String objid, FTYPE type) throws TException {
        return null;
    }

    @Override
    public AllocObjResult allocobj(String token, FileInfo item, Map<String, String> desc) throws TException {
        return null;
    }

    @Override
    public QueryUpldObjResult queryobj(String token, FTYPE type, String objid) throws TException {
        return null;
    }

    @Override
    public RetHead appendObj(String token, String oid, ByteBuffer bin, FTYPE type, long offset) throws TException {
        return null;
    }

    @Override
    public RetHead commitObj(String token, String oid, Map<String, String> odescr, FTYPE type) throws TException {
        return null;
    }

    @Override
    public RetHead delObj(String token, String oid, FTYPE type) throws TException {
        return null;
    }

    @Override
    public UsageResult querusage(String token, FTYPE type) throws TException {
        return null;
    }

    @Override
    public DownloadResult downloadFile(String token, DownloadParam param) throws TException {
        return null;
    }

    @Override
    public RetHead renameObj(String token, String oid, String newname, FTYPE type) throws TException {
        return null;
    }

    @Override
    public CreateShareResult CreateShare(String token, String oid, FTYPE type) throws TException {
        return null;
    }

    @Override
    public VersionResult GetVer() throws TException {
        return null;
    }

    @Override
    public QueryAppResult queryApps() throws TException {
        return null;
    }

    @Override
    public QueryHelpResult queryHelp() throws TException {
        return null;
    }

    @Override
    public QueryFeeResult queryFee(String token) throws TException {
        return null;
    }

    @Override
    public QueryThumbnailResult queryThumbnail(String token, FTYPE ftype, String objid) throws TException {
        return null;
    }

    @Override
    public RetHead Resetpwd(String token, String pwd, String umobile, String captcha) throws TException {
        return null;
    }

    @Override
    public RetHead Changepwd(String token, String pwd_org, String pwd) throws TException {
        return null;
    }

    @Override
    public RetHead Resetimie(String imie, String umobile, String captcha) throws TException {
        return null;
    }

    @Override
    public RetHead BindUmobile(String token, String captcha, String umobile, String imie) throws TException {
        return null;
    }

    @Override
    public RetHead UnBindUmobile(String token, String captcha, String umobile, String imie) throws TException {
        return null;
    }

    @Override
    public RetHead RegistUser(String umobile, String password, String captcha) throws TException {
        return null;
    }

    @Override
    public RetHead VerifyCathcha(String umobile, String captcha) throws TException {
        return null;
    }

    @Override
    public RetHead SetAlias(String token, String ualias) throws TException {
        return null;
    }

    @Override
    public UserAliasResult QueryAlias(String token) throws TException {
        return null;
    }

    @Override
    public NetURLResult GetMobileAccessUrl() throws TException {
        return null;
    }

    @Override
    public NetMobileNumberResult GetMobileNumber(String Url) throws TException {
        return null;
    }

    @Override
    public RetHead SetUserInfo(String token, UserInfo uinfo) throws TException {
        return null;
    }

    @Override
    public UserInfoResult QueryUserInfo(String token) throws TException {
        return null;
    }

    @Override
    public RetHead CreateUserBucket(String umobile, FTYPE ftype) throws TException {
        return null;
    }

    @Override
    public RetHead DeleteBucketAllObj(String token, FTYPE ftype) throws TException {
        return null;
    }

    @Override
    public RetHead Cancel(String token, String umobile) throws TException {
        return null;
    }

    @Override
    public RetHead Order(String token, PTYPE ptype) throws TException {
        return null;
    }
}
