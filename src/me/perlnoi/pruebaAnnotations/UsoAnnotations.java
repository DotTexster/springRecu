package me.perlnoi.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());

	}
}