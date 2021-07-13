package test;

import java.time.LocalDate;

import datos.Automotor;
import datos.Contribuyente;
import datos.Inspeccion;
import datos.Persona;
import negocio.AutomotorABM;

public class Traer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutomotorABM autoABM = new AutomotorABM();
	
		//1) + traerContribuyente (2) : Contribuyente
		
/*		try {
			
			System.out.println(                           "\n\nCASO DE USO 1 traerContribuyente (2) ");
			//System.out.println(autoABM.traerPersona(2));
			System.out.println(autoABM.traerContribuyente(2));
		}catch(Exception he) {
			System.out.println(he.getMessage());
		}*/
		
		
		//2) + traerInspector (1) : Inspector
		
	try {
		
		System.out.println(                           "\n\nCASO DE USO 2 traerInspector (1) ");
		System.out.println(autoABM.traerInspector(1));
		}catch(Exception he) {
			System.out.println(he.getMessage());
		}
		
		
		
		//3) + traerAutomotor (LLL444) : Automotor
	System.out.println(                           "\n\nCASO DE USO 3 traerAutomotor (LLL444)");
	try {
		System.out.println(autoABM.traerAutomotorr("LLL444"));
	}catch(Exception he) {
		System.out.println(he.getMessage());
	}
	
	/*TRAE EL AUTO POR ID*/
	//System.out.println(autoABM.traerAuto(1));
	
	//4) + traerInspeccion (1) : Inspeccion
/*	System.out.println(                           "\n\nCASO DE USO 4 traerInspeccion (1)");
	try {
		System.out.println(autoABM.traerInspeccion(1)); 
	}catch(Exception he) {
		System.out.println(he.getMessage());
	}
	
		
	
	
	
	
	//5) + traerInspeccion (Automotor [idAutomotor=5, dominio=LLL444, modelo=2012,
	System.out.println(                           "\n\nCASO DE USO 5   traerInspeccion (Automotor [idAutomotor=5]");
	try {
		Automotor a= autoABM.traerAuto(5);
		
		for(Inspeccion insp :autoABM.traerInspeccion(a))
			System.out.println(insp);
		
		}catch(Exception he) {
			System.out.println(he.getMessage());
		}
		
		//6) + traerInspeccion (11/2/2021) : Inspeccion
	System.out.println(                           "\n\nCASO DE USO 6   traerInspeccion (11/2/2021)");
	try {
		LocalDate f = LocalDate.of(2021,02, 11);
		for(Inspeccion insp :autoABM.traerInspeccion(f))
			System.out.println(insp);
		
		
	}catch(Exception he) {
		System.out.println(he.getMessage());
	}
	
		
		
		//7) + traerInspeccion (Inspector [idPersona=1, apellido=Perez, nombres=Juan, dni=11111111,
				//legajo=100] ,11/2/2021) : Inspeccion
	System.out.println(                           "\n\nCASO DE USO 7 traerInspeccion (Inspector [idPersona=1, apellido=Perez, nombres=Juan, dni=11111111,\r\n"
			+ "				//legajo=100] ,11/2/2021) : Inspeccion");
	try {
		LocalDate fe= LocalDate.of(2021, 02, 11);
		for(Inspeccion insp :autoABM.traerInspeccion(autoABM.traerInspector(1),fe))
			System.out.println(insp);
		//System.out.println(autoABM.traerInspeccion(autoABM.traerInspector(1),fe));
	}catch(Exception he) {
		System.out.println(he.getMessage());
	}
	
	//8) + traerInspeccion (13/2/2021 , apto) : Inspeccion
	System.out.println(                           "\n\nCASO DE USO 8 traerInspeccion (13/2/2021 , apto) : Inspeccion");
	try {

		LocalDate fe= LocalDate.of(2021, 02,13);
		for(Inspeccion insp :autoABM.traerInspeccion(fe ,"apto"))
			System.out.println(insp);
		
	}catch(Exception he) {
		System.out.println(he.getMessage());
	}
/*	
	for(Persona  c :autoABM.traerContr())
		System.out.println(c);
	
	}
	*/
/*	for(Contribuyente  c :autoABM.traerContri())
		System.out.println(c);
	*/
	}

	

}
