package me.perlnoi.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vnder, vender y vender mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial";
	}

}
