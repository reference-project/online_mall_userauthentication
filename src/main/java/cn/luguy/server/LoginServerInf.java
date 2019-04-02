package cn.luguy.server;

import javax.jws.WebService;

import cn.luguy.bean.T_MALL_USER_ACCOUNT;

@WebService
public interface LoginServerInf {
	public String login(T_MALL_USER_ACCOUNT user);
}
