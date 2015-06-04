package modelo;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Practica Final
//  @ File Name : Empleado.java
//  @ Date : 14/07/2013
//  @ Author : Sebastian Szarfsztejn
//
//

public abstract class Empleado {
	private String nombre;
	private String domicilio;
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public abstract float calcularSueldo();

	public EmpleadoView getView() {
		return new EmpleadoView(nombre, domicilio, legajo);
	}

	public Empleado(String nom, String dom, int leg) {
		nombre = nom;
		domicilio = dom;
		legajo = leg;
	}

	public boolean sosElEmpleado(int leg) {
		return legajo == leg;
	}
}