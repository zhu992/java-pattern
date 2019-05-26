package com.zwy.pattern.chainofresponsibility;

/**
 * Created by zwy on 2019/5/25.
 * 审批者
 */
public abstract class Approver {
    //为了子类能直接访问所以设置成protected
    protected Approver approver;

    public void setNext(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
