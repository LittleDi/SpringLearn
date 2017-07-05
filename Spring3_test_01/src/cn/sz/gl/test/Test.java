package cn.sz.gl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sz.gl.hello.HelloSpring;

public class Test {

	public static void main(String[] args) {
		/*HelloSpring hs = new HelloSpring();
		hs.show();*/
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs = (HelloSpring) ac.getBean("hs");
		hs.show();
		
		
	}
}
