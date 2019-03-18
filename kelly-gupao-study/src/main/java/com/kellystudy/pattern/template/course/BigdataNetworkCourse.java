package com.kellystudy.pattern.template.course;

public class BigdataNetworkCourse extends  NetworkCourse {

    private boolean needHomeworkFlag = false ;

    public BigdataNetworkCourse(boolean needHomeworkFlag){
        this.needHomeworkFlag =needHomeworkFlag ;
    }

    //检查课后作业
    @Override
    void checkHomework() {
        System.out.println("检查大数据的课程");
    }


    @Override
    boolean needHomework() {
        return this.needHomeworkFlag ;
    }

}
