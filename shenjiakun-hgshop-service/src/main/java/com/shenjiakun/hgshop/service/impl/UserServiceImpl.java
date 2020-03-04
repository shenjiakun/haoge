package com.shenjiakun.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.shenjiakun.hgshop.config.AdminProperties;
import com.shenjiakun.hgshop.service.UserService;
@Service(interfaceClass = UserService.class,version ="1.0.0" )
public class UserServiceImpl implements UserService {

	// 得到管理员的信息
		@Autowired
		AdminProperties adminPro;
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		//判断用户和密码是否与配置文件一致
			return (adminPro.getAdminName().equals(username) 
					&& adminPro.getPassword().equals(password));
			
			}

}
