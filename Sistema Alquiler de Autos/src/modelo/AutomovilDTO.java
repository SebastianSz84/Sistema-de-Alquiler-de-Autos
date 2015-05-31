package modelo;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Sistema de Alquiler de Autos
//  @ File Name : AutomovilDTO.java
//  @ Date : 09/05/2013
//  @ Author : Grupo 5
//
//

public class AutomovilDTO {
	private int idAuto;
	private String anio;
	private String patente;
	private float kilometraje;
	private float combustible;
	private boolean activo;

	public AutomovilDTO(int idAuto, String anio, String patente, float kilom,
			float comb, boolean activo) {
		this.idAuto = idAuto;
		this.anio = anio;
		this.patente = patente;
		this.kilometraje = kilom;
		this.combustible = comb;
		this.activo=activo;
	}

	public int getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public float getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(float kilometraje) {
		this.kilometraje = kilometraje;
	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}


}