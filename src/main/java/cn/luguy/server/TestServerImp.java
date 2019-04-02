package cn.luguy.server;

public class TestServerImp implements TestServerInf {

	public String ping(String hello) {
		System.out.println("cxf接口调用:" + hello);
		return "pong";
	}

}
