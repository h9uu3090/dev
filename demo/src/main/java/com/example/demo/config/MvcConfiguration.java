package com.example.demo.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**") // '/'를 시작으로 하는 모든 요청을 다룬다는 것을 의미
		        .addResourceLocations("classpath:/templates/", "classpath:/static/") //위(addResourceHandler)에 해당하는 요청을 처리할 자원을 찾을 위치.
		        .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES)); //요청에 대한 Cache를 10분으로 설정한 것입니다. 이 부분은 신경쓰지 않으셔도 좋습니다.
	}
}
 