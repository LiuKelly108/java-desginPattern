package com.kellystudy.pattern.template.jdbc.dao;

import com.kellystudy.pattern.template.jdbc.JDBCTemplate;
import com.kellystudy.pattern.template.jdbc.Member;
import com.kellystudy.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao extends JDBCTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from user " ;
        return  super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                //使用原型模式进行克隆
                Member  member = (Member) ResultToObject(rs ,Member.class);
                return member;
            }
        } ,null);
    }


    //将rs的值克隆到clazz中
    private Object  ResultToObject(ResultSet rs,Class<?> clazz) throws IllegalAccessException, InstantiationException, SQLException, InvocationTargetException {
     //获得实例
      Object obj =  clazz.newInstance();
      Method[] methods = clazz.getDeclaredMethods();
      for(Method m : methods){
          String m_name = m.getName();
          if(m_name.startsWith("set")){
             String field =  m_name.replace("set","").toLowerCase().trim();
             m.invoke(obj,rs.getString(field)==null?null:rs.getString("field"));
          }
      }
      return obj ;
    }

}
