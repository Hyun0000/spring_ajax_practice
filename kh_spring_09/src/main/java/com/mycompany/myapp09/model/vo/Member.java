package com.mycompany.myapp09.model.vo;

import java.sql.Date;

public class Member {
//	MEMBER_ID VARCHAR2(30) PRIMARY KEY,
//	MEMBER_PWD VARCHAR2(100) NOT NULL,
//	MEMBER_NM VARCHAR2(15) NOT NULL,
//	MEMBER_ENROLL_DT DATE DEFAULT SYSDATE
	private String memberId;
	private String memberPwd;
	private String memberName;
	private Date memberEnrollDate;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getMemberEnrollDate() {
		return memberEnrollDate;
	}
	public void setMemberEnrollDate(Date memberEnrollDate) {
		this.memberEnrollDate = memberEnrollDate;
	} 

	public Member() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberEnrollDate=" + memberEnrollDate + "]";
	}
}
