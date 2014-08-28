package com.concretepage.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 7/20/14
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
@Namespace("/annotation")
@Action("/annotatedHello")
@ResultPath(value = "/")
@Result(name = "success", location = "/manning/ch2/Annotation.jsp")
public class AnnotatedHelloAction extends ActionSupport {
    private String msg = "JavaBeat - Struts2 annotation example";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String execute() {
        return SUCCESS;
    }
}
