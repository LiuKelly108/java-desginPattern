package com.kellystudy.pattern.template.jdbc;

import com.kellystudy.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<Member>  list= (List<Member>) memberDao.selectAll();
        System.out.println(list);
    }
}
