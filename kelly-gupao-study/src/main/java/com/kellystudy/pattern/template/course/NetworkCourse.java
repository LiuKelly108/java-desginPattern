package com.kellystudy.pattern.template.course;

public abstract  class NetworkCourse {

    // 1.创建课程
    final  void  createCourse() {
        //1.1 发布预习资料
        this.postPreResource();
        //1.2 制作ppt
        this.createPPT();
        //1.3 在线直播
        this.liveVideo();
        //1.4 提交课件，课堂笔记
        this.postNote();
        //1.5 提交源码
        this.postCodeResource();
        //1.6 布置作业，有些课程是有作业的，有些课程没有作业
        //如果有作业，则检查作业，没有作业，则完成
        if(needHomework()){
            checkHomework();
        }
    }



    //2、检查作业
    abstract  void  checkHomework();


    final void postPreResource(){
        System.out.println("发布预习资料");
    }
    final void createPPT(){
        System.out.println("创建ppt");
    }
    final void liveVideo(){
        System.out.println("直播课程");
    }
    final void postNote(){
        System.out.println("提交课件和笔记");
    }
    final void postCodeResource(){
        System.out.println("提交源码");
    }

    //钩子方法，实现流程的微调。干预流程，使得控制行为流程更加灵活，更符合实际业务需求（返回值：boolean，int）
     boolean needHomework(){
        return   false ;
    }
}
