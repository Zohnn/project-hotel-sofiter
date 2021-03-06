package com.hotel.sofiter.entity.resp.stayregister;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class FinancialQueryResp<T> {

    /**
     * 页面大小
     * */
    @ApiModelProperty("页面大小")
    private int pageSize=10;
    /**
     * 当前页面
     * */
    @ApiModelProperty("当前页面")
    private int pageNum=1;
    /**
     * 总条数
     * */
    @ApiModelProperty("总条数")
    private long totalRecord;
    /**
     * 总页数
     * */
    @ApiModelProperty("总页数")
    private long totalPage;
    /**
     * 结果集
     * */
    @ApiModelProperty("结果集")
    private List<T> result=new ArrayList<T>();

    public FinancialQueryResp(List<T> result) {
        this.result = result;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
