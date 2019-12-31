package com.qhit.entity;

import java.util.Date;

public class Essay {
    //上传的文章和内容
    private int nid;
    private int ntid;  //标题ID
    private String ntitle;//标题
    private String nauthor;//作者
    private Date ncreateDate;//创建时间
    private String npicPath; //标题图片
    private String ncontent;//文章内容
    private Date nmodifDate;//修改日期
    private String nsummary; //摘要内容

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getNtid() {
        return ntid;
    }

    public void setNtid(int ntid) {
        this.ntid = ntid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor;
    }

    public Date getNcreateDate() {
        return ncreateDate;
    }

    public void setNcreateDate(Date ncreateDate) {
        this.ncreateDate = ncreateDate;
    }

    public String getNpicPath() {
        return npicPath;
    }

    public void setNpicPath(String npicPath) {
        this.npicPath = npicPath;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public Date getNmodifDate() {
        return nmodifDate;
    }

    public void setNmodifDate(Date nmodifDate) {
        this.nmodifDate = nmodifDate;
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary;
    }


    @Override
    public String toString() {
        return "Essay{" +
                "nid=" + nid +
                ", ntid=" + ntid +
                ", ntitle='" + ntitle + '\'' +
                ", nauthor='" + nauthor + '\'' +
                ", ncreateDate=" + ncreateDate +
                ", npicPath='" + npicPath + '\'' +
                ", ncontent='" + ncontent + '\'' +
                ", nmodifDate=" + nmodifDate +
                ", nsummary='" + nsummary + '\'' +
                '}';
    }
}
