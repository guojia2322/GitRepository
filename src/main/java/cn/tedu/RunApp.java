package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication	//标识这个启动类是SprintBoot程序
                 	//标识是一个SpringBoot，它会先创建spring环境，servlet环境\
@MapperScan(basePackages="cn.tedu.mapper")	//mybatis接口文件扫描
public class RunApp  implements EmbeddedServletContainerCustomizer{
	//执行入口
	public static void main(String[] args) {
		//需要spring环境servlert运行环境
		SpringApplication.run(RunApp.class, args);
	}
	
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);
	}
}
