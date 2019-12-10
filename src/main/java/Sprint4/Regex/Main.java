package Sprint4.Regex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 	Scanner reader = new Scanner (System.in);
		 	String cadena;
		 	MisReglas reglas = new MisReglas();
		 	
		 	System.out.println("Validar si tiene tres caracteres y la primera mayuscula: ");
		 	cadena = reader.next();
		 	
		 	if (reglas.validarSiTieneNumeros(cadena)) {
		 		System.out.println("VALIDO");
		 	}else {
		 		System.out.println("NO VALIDO");
		 	}
		 		
		 	

	    

	}

}
