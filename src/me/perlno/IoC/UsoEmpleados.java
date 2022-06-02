package me.perlno.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		//System.out.println(Juan.getTareas());
		//System.out.println(Juan.getInforme());
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		System.out.println(maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		contexto.close();
		/*
		Empleados empleado = new DirectorEmpleado();
		
		
		System.out.println(empleado.getTareas());
		*/
	}
}