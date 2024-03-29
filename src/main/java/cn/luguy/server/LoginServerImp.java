package cn.luguy.server;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import cn.luguy.bean.T_MALL_USER_ACCOUNT;
import cn.luguy.service.LoginServiceInf;

public class LoginServerImp implements LoginServerInf {

	@Autowired
	LoginServiceInf loginServiceInf;

	@Path("login")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	public String login(@BeanParam T_MALL_USER_ACCOUNT user) {
		T_MALL_USER_ACCOUNT select_user = loginServiceInf.login(user);

		Gson gson = new Gson();
		return gson.toJson(select_user);
	}

}
