package me.perlnoi.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	public ComercialExperimentado() {
		
	}


	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vnder, vender y vender mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		// return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim1")
	private CreacionInformeFinanciero nuevoInforme;
	
	
}
