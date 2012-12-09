package org.MatiasNahuelHeredia.Examen;

import java.sql.Date;

public interface ILegajo {
	public int getNumeroLegajo();
	public String getApellido();
	public void setApellido(String apellido);
	public int getHorasExtras();
	public void setHorasExtras(int horasExtras);
	public double getValorAdicional(); 
	public void setValorAdicional(float valorAdicional);
	public void setNumeroLegajo(int numeroLegajo);
	public String getNombre();
	public void setNombre(String nombre);
	public double getSueldo();
	public void setSueldo(double d);
	public Date getFechaNacimiento();
	public void setFechaNacimiento(Date fechaNacimiento);
}
