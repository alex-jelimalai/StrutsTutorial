package com.concretepage.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/user")
@Action("/login")
@ResultPath(value = "/")
@Result(name = "success", location = "login.jsp")
public class LoginAction extends ActionSupport {
    public String execute() {
        return SUCCESS;
    }
} 