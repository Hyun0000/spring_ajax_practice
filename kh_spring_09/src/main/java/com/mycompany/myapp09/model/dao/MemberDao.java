package com.mycompany.myapp09.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberdao")
public class MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public int idCheck(String id) throws Exception {
		int result = 0;
		result = sqlSessionTemplate.selectOne("member.idCheck", id);
		System.out.println("dao result : " + result);
		return result;
	}
}
