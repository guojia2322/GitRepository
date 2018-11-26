package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication	//��ʶ�����������SprintBoot����
                 	//��ʶ��һ��SpringBoot�������ȴ���spring������servlet����\
@MapperScan(basePackages="cn.tedu.mapper")	//mybatis�ӿ��ļ�ɨ��
public class RunApp  implements EmbeddedServletContainerCustomizer{
	//ִ�����
	public static void main(String[] args) {
		//��Ҫspring����servlert���л���
		SpringApplication.run(RunApp.class, args);
	}
	
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);
	}
}
