package me.perlno.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado = new DirectorEmpleado();
		
		
		System.out.println(empleado.getTareas());
		
	}
}