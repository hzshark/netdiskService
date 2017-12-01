package cn.bestsign.auto.netdiskService.controller.page;

import cn.bestsign.auto.netdiskService.vo.admin.AdminUserInfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


/**
 * 页面跳转
 *
 */
@Controller
@RequestMapping("/admin")
public class PageController {


    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index() {
        return "/login";
    }

    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLoginPage() {
        return "/login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String toMain(){
        return "main";
    }

    @RequestMapping(value = "/table",method = RequestMethod.GET)
    public String toTable(){
        return "table";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String toTest(){
        return "test";
    }


    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String toFrom(){
        List<AdminUserInfoVo> list = new ArrayList<AdminUserInfoVo>();
        return "form";
    }

}
