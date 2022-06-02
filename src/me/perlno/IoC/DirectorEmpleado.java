package me.perlno.IoC;

public class DirectorEmpleado implements Empleados {
	
	private String email;
	private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	//Creaci�n de campo tipo creacionInforme(interfaz)
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
	
	//metodo init

	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar antes de que el bean se inicialice");
	}
	
	//metodo destroy

	public void metodoFinal() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar despues de utilizar el bean");
	}
	
}
