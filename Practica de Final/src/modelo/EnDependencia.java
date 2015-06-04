package modelo;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Practica Final
//  @ File Name : EnDependencia.java
//  @ Date : 14/07/2013
//  @ Author : Sebastian Szarfsztejn
//
//

public class EnDependencia extends Empleado {
	private float sueldoBruto;

	public EnDependencia(String nom, String dom, int leg, float sueldo) {
		super(nom, dom, leg);
		sueldoBruto = sueldo;
	}

	public float calcularSueldo() {
		return sueldoBruto - (13 * sueldoBruto / 100);
	}
}