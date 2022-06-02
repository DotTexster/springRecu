package me.perlno.IoC;

public class DirectorEmpleado implements Empleados {

	//Creación de campo tipo creacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	};
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: " +informeNuevo.getInformes();
	}

}
