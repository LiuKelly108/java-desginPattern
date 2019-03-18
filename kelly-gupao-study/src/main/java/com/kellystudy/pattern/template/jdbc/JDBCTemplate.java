package com.kellystudy.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JDBCTemplate {

    private DataSource   dataSource ;


    public JDBCTemplate(DataSource dataSource){
        this.dataSource = dataSource ;
    }

    public List<?> executeQuery(String sql , RowMapper<?> rowMapper , Object[] values){

        List<?> list =new ArrayList();
        try {
            //1.获取连接
            Connection conn = this.getConnection() ;
            //2、创建语句集
            PreparedStatement  ps = this.createPrepareStatement(conn ,sql );
            //3.执行语句集
            ResultSet  rs =this.executeQuery(ps,values);
            //4、处理结果集
             list = this.paresResultSet(rs,rowMapper);
            //5、关闭结果集
            this.closeResultSet(rs);
            //6、关闭语句集
            this.closePrepareStatement(ps);
            //7、关闭连接
            this.closeConnection(conn);
       }catch (Exception e){
            e.printStackTrace();
       }
        return  list ;
    }



    protected void closeConnection(Connection conn) throws SQLException {
        if(conn!=null){
            conn.close();
        }
    }


    protected void closePrepareStatement(PreparedStatement ps) throws SQLException {
        if(ps!=null){
            ps.close();
        }
    }

    protected void closeResultSet(ResultSet rs) throws SQLException {
        if(rs!=null){
            rs.close();
        }
    }

    //处理结果集
    protected List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> list =new ArrayList<Object>();
        int rowNum =1 ;
        while (rs.next()){
            list.add(rowMapper.mapRow(rs,rowNum++));
        }
        return  list ;
    }

    //执行
    protected   ResultSet  executeQuery(PreparedStatement ps,Object[] values) throws SQLException {
        for (int i= 0 ;i<values.length ;i++){
            ps.setObject(i,values[i]);
        }
        return  ps.executeQuery() ;
    }

    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return  conn.prepareStatement(sql);
    }


    protected Connection getConnection() throws SQLException {
        return  this.dataSource.getConnection();
    }

}
