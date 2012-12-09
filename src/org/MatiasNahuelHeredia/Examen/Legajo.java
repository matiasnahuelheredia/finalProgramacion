package org.MatiasNahuelHeredia.Examen;

import java.io.Serializable;
import java.util.*;



public class Legajo implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -2151443674815505819L;
private int numeroLegajo;
private String nombre;
private String apellido;
private double sueldoMensual;
private Date fechaNacimiento;
private int cantHorasExtras;
private double valorAdicional;
private boolean delete;
public Legajo() {
	super();
	this.delete = false;
}
public int getNumeroLegajo() {
	return numeroLegajo;
}
public void setNumeroLegajo(int numeroLegajo) {
	this.numeroLegajo = numeroLegajo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public double getSueldoMensual() {
	return sueldoMensual;
}
public void setSueldoMensual(double sueldoMensual) {
	this.sueldoMensual = sueldoMensual;
}
public Date getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public int getCantHorasExtras() {
	return cantHorasExtras;
}
public void setCantHorasExtras(int cantHorasExtras) {
	this.cantHorasExtras = cantHorasExtras;
}
public double getValorAdicional() {
	return valorAdicional;
}
public void setValorAdicional(double valorAdicional) {
	this.valorAdicional = valorAdicional;
}
public boolean isDelete() {
	return delete;
}
public void setDelete(boolean delete) {
	this.delete = delete;
}

}
