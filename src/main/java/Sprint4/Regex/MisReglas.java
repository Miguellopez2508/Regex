package Sprint4.Regex;

public class MisReglas {
	
	public boolean tresCaracteres(String cadena) {
		
		if (cadena.length() == 3 ) {	 		
	 		return true;
	 	}else {		 		
	 		return false;
	 	}
			
	}
	
	public boolean primeraEsMayuscula (String cadena) {
		
		if (cadena.substring(0).contentEquals(cadena.substring(0).toUpperCase())) {
			return true;
	 	}else {
	 		return false;
	 	}	
	
	}
	
	public boolean validarSiTieneNumeros (String cadena) {
		
		char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
		
		char[] palabra = cadena.toCharArray();
		
		boolean validar = false;
		
		for (int i=0; i<numeros.length; i++) {
			for (int x=i+1; x<palabra.length; x++) {
				if(numeros[i] == palabra[x]) {
					validar = true;
				}
			}		
		}
		return validar;

	}

	

}
