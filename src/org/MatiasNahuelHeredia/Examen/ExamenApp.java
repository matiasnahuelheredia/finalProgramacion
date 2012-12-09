package org.MatiasNahuelHeredia.Examen;


import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.reflect.InvocationTargetException;



public class ExamenApp {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 */

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		
       
		ArrayList<Legajo> listaLega = new ArrayList<Legajo>();
		Legajo legaj = new Legajo();
		
		if (legaj!=null)
		try {
			listaLega = (ArrayList<Legajo>)Persistencia.GetObjeto(listaLega,"lista");
		} catch (FileNotFoundException e) {
		     Persistencia.GuardarObjeto(listaLega,"lista");
		}
		catch(Exception ex)
		{
			System.out.println("Error en el archivo");
			System.out.println(ex);
		}
		
		try
		{
			legaj.setNombre(args[0]);
			legaj.setApellido(args[1]);
			Date fechaNacimiento = DeStringADate(args[2]);
			legaj.setFechaNacimiento(fechaNacimiento);
		    legaj.setNumeroLegajo(Integer.parseInt(args[3]));
		    legaj.setSueldoMensual(Double.parseDouble(args[4]));
		    legaj.setValorAdicional(Double.parseDouble(args[5]));		    
		}
		catch (Exception ex)
		{
			System.out.println("La entrada fue incorrecta ingrese los datos nuevamente:");
		}
		
		if ((legaj !=null)&&(args[6].equals("guardar")))
			listaLega.add(legaj);
	 if (legaj.getNumeroLegajo()!=0)
	 {
		
		Persistencia.GuardarObjeto(listaLega,"lista");
		
		      for( Iterator<Legajo> it = listaLega.iterator(); it.hasNext(); ) { 
			       Legajo ProvisLegajo = (Legajo)it.next();
			       
			       if (ProvisLegajo.isDelete()==false)
			       {
			       System.out.println("Nombre: "+ProvisLegajo.getNombre());
			       System.out.println("Apellido: "+ProvisLegajo.getApellido());
			       System.out.println("NumeroLegajo: "+ProvisLegajo.getNumeroLegajo());
			       System.out.println("FechaNacimiento: "+ProvisLegajo.getFechaNacimiento());
			       System.out.println("Sueldo Mensual: "+ProvisLegajo.getSueldoMensual());
			       System.out.println("Valor hora Adicional: "+ProvisLegajo.getValorAdicional());
			       
			       }
		}
		
	   }
	 
	}
	public static Date DeStringADate(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        String strFecha = fecha;
	        Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(strFecha);
	            return fechaDate;
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	            return fechaDate;
	        }
	    }
	
}
