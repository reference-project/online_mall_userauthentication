package cn.luguy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.luguy.bean.T_MALL_USER_ACCOUNT;
import cn.luguy.mapper.LoginMapper;

@Service
public class LoginServiceImp implements LoginServiceInf {

	@Autowired
	LoginMapper loginMapper;

	public T_MALL_USER_ACCOUNT login(T_MALL_USER_ACCOUNT user) {
		// TODO Auto-generated method stub
		return loginMapper.select_user(user);
	}

}
