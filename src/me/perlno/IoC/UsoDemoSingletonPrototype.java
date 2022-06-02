package me.perlno.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(maria);
		System.out.println(pedro);
	}

}
