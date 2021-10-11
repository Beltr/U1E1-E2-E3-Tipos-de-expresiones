
package expresion;
public class ExpresionLogicaV2 {
	static private  int contadorLetras=0;
	static private int contadorNumero=0;
	static private int contadorLN=0;
public ExpresionLogicaV2() {
	String cadena="Aa 12 b 3 c 4 D 5 ee3 10 dd 124 juli0";
        //String cadena="( 9 + 8.6 ) * .1 / .5^2 - 76";
	String[] palabras = cadena.split(" ");
	 for(int i=0; i<palabras.length; i++) {
			 contienen(palabras[i]);
		 }
	 System.out.println("\nValores Guardados: "+palabras.length+"\n"
		             +"Char: "+contadorLetras+"\n"+
			      "Integer: "+ contadorNumero+"\n"+
		              "String: "+ contadorLN);
         
}
public static void contienen(String palabra ) {			
			try {
				Integer.parseInt(palabra);
				System.out.print(palabra+" ");
				contadorNumero++;
			} catch (NumberFormatException nfe){
				if (esSoloLetras(palabra) || esSoloSimbolo(palabra)) {
					System.out.print(palabra+" ");
					if(palabra.length()>=2){
						contadorLN++;
					}else{contadorLetras++; 
					}
				} else {
					System.out.print(palabra+" ");
					contadorLN++;
				}
			}
		 }

public static boolean esSoloLetras(String cadena){
	for (int i = 0; i < cadena.length(); i++){
		char caracter = cadena.toUpperCase().charAt(i);
		int valorASCII = (int)caracter;
		if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90) )
			return false; 
                
        }
	return true;	
}
public static boolean esSoloSimbolo(String cadena){
	for (int i = 0; i < cadena.length(); i++){
		char caracter = cadena.toUpperCase().charAt(i);
		int valorASCII = (int)caracter;
		if (valorASCII < 33 || valorASCII > 47)
			return false; 
                
        }
	return true;	
}
}


