package com.qhit.entity;

import java.util.Date;

public class Comments {
    //评论表
    private int cid; //评论者ID
    private int cnid;
    private String ccontent;//评论者内容
    private Date cdate; //评论时间
    private String cip;  //评论者IP
    private String cauthor; //评论者

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCnid() {
        return cnid;
    }

    public void setCnid(int cnid) {
        this.cnid = cnid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getCauthor() {
        return cauthor;
    }

    public void setCauthor(String cauthor) {
        this.cauthor = cauthor;
    }


    @Override
    public String toString() {
        return "Comments{" +
                "cid=" + cid +
                ", cnid=" + cnid +
                ", ccontent='" + ccontent + '\'' +
                ", cdate=" + cdate +
                ", cip='" + cip + '\'' +
                ", cauthor='" + cauthor + '\'' +
                '}';
    }
}
