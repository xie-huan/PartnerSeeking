package com.example.demo.entity;

import java.util.Date;

public class Post {
    private Integer pId;

    private String pTittle;

    private String pKeyword;

    private String pContent;

    private Integer pNum;

    private String pUid;

    private Date pPosttime;

    private Date pEndtime;

    private Integer pCollectnum;

    private Byte pBan;

    private Byte pPro;

    private Byte pExi;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpTittle() {
        return pTittle;
    }

    public void setpTittle(String pTittle) {
        this.pTittle = pTittle;
    }

    public String getpKeyword() {
        return pKeyword;
    }

    public void setpKeyword(String pKeyword) {
        this.pKeyword = pKeyword;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public Integer getpNum() {
        return pNum;
    }

    public void setpNum(Integer pNum) {
        this.pNum = pNum;
    }

    public String getpUid() {
        return pUid;
    }

    public void setpUid(String pUid) {
        this.pUid = pUid;
    }

    public Date getpPosttime() {
        return pPosttime;
    }

    public void setpPosttime(Date pPosttime) {
        this.pPosttime = pPosttime;
    }

    public Date getpEndtime() {
        return pEndtime;
    }

    public void setpEndtime(Date pEndtime) {
        this.pEndtime = pEndtime;
    }

    public Integer getpCollectnum() {
        return pCollectnum;
    }

    public void setpCollectnum(Integer pCollectnum) {
        this.pCollectnum = pCollectnum;
    }

    public Byte getpBan() {
        return pBan;
    }

    public void setpBan(Byte pBan) {
        this.pBan = pBan;
    }

    public Byte getpPro() {
        return pPro;
    }

    public void setpPro(Byte pPro) {
        this.pPro = pPro;
    }

    public Byte getpExi() {
        return pExi;
    }

    public void setpExi(Byte pExi) {
        this.pExi = pExi;
    }
}