package me.perlnoi.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		if (Antonio == Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria\n" +Antonio +"\n" +Lucia);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria\n" +Antonio +"\n" +Lucia);
		}
		
		contexto.close();
		
	}
}