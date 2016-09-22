package com.py.test.util;

import org.apache.shiro.authc.UsernamePasswordToken;

public class ShiroToken extends UsernamePasswordToken  implements java.io.Serializable{
	
	private static final long serialVersionUID = -6451794657814516274L;

	public ShiroToken(String loginname, String password, int loginType) {
		super(loginname,password);
		this.password = password ;
		this.loginType = loginType;
	}

	/** 登录密码[字符串类型] 因为父类是char[] ] **/
	private String password ;

	public String getPswd() {
		return password;
	}

	private int loginType;

	public int getLoginType(){
		return this.loginType;
	}
	public void setLoginType(int loginType){
		this.loginType = loginType;
	}

	public void setPswd(String pswd) {
		this.password = password;
	}
	
	
	
	
	
}
