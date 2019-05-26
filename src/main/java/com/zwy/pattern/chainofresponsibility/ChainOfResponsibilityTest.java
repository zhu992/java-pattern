package com.zwy.pattern.chainofresponsibility;

/**
 * Created by zwy on 2019/5/25.
 * 责任链模式测试
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();

        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java设计模式");
        course.setArticle("课程的手记");
        course.setVideo("课程的视频");

        //编排审批的顺序 article --> video
        articleApprover.setNext(videoApprover);

        //发布课程
        articleApprover.deploy(course);
    }
}
