package com.zwy.pattern.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * Created by zwy on 2019/5/25.
 * 处理链上的一个节点
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        //执行业务逻辑
        if (StringUtils.isNoneEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频审批通过");
            //审批通过后处理下个节点
            if (Objects.nonNull(approver)) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "没有视频审批不通过");
        }
    }
}
