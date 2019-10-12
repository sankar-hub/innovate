package com.ns.soft.pkg.sampleweb.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// 	Either Configuration or Component 
// @Component
public class TopicServiceInterceptAppConfig implements WebMvcConfigurer {

	@Autowired
	private TopicServiceInterceptor topicServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(topicServiceInterceptor);
	}

}
