package modelo;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Sistema de Alquiler de Autos
//  @ File Name : ItemFactura.java
//  @ Date : 09/05/2013
//  @ Author : Grupo 5
//
//

public class ItemFactura {
	private String descripcion;
	private float monto;

	public ItemFactura(String descripcion, float monto) {
		this.descripcion = descripcion;
		this.monto = monto;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public float getMonto(){
		return monto;
	}

	public void setMonto(float monto){
		this.monto = monto;
	}
}