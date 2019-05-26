package com.zwy.pattern.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * Created by zwy on 2019/5/25.
 * 处理链上的一个节点
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        //处理目标对象
        if (StringUtils.isNoneEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记审批通过");
            //链的下一个元素处理
            if (Objects.nonNull(approver)) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记流程结束");
        }
    }
}
