package com.springboot.dubbo.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.service.BaseService;  

@Service(group="helloService", version="1.0") 
public class HelloService implements BaseService {

	public String build(String str) 
	{  
        return "hello "+str+" !";  
    }

}
