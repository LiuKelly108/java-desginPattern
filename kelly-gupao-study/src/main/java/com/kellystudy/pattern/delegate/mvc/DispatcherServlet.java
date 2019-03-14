package com.kellystudy.pattern.delegate.mvc;

import com.kellystudy.pattern.delegate.mvc.controller.MemberController;
import com.kellystudy.pattern.delegate.mvc.controller.OrderController;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {

    /**
     * servlet的生命周期初始化
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        //初始化开始的时候，创建一个容器，放置url和方法的映射

    }

    public  void  dispatcher(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String url = req.getRequestURI();
        String id =  req.getParameter("id");
        if("getMemberId".equals(url)){
            new MemberController().getMemeberByID(id);
        }else if("getOrderById".equals(url)){
            new OrderController().getOrderById(id);
        }else{
            res.getWriter().write("404 not fonud");
        }
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       //委派给dispatcher处理
        dispatcher(req,res);
}


}
