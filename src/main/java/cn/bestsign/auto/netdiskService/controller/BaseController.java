package cn.bestsign.auto.netdiskService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Resource
    protected HttpServletRequest request;

    @Resource
    protected HttpSession session;

}