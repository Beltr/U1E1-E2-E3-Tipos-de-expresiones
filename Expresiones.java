package Expresion;
import expresiones.ExpresionLogicaV2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Expresiones {
  
    public static void main(String[] args) throws IOException {
      Scanner leer=new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1.- Operacion Aritmetica\n"
                              +"2.- Operacion Logica\n"
                             + "3.- Operacion LogicaV2\n"
                             + "4.- Salir");
            String opcion = leer.nextLine();
            switch(opcion){
                case "1":
                    ExpresionArtime opcion1 = new ExpresionArtime();
                    
                    break;
                case "2":
                   ExpresinoLogica opcion2= new ExpresinoLogica();
                    break;
                    
                case "3":
                    ExpresionLogicaV2 opcion3 = new  ExpresionLogicaV2 ();
                  
                    break;
                    
                case "4":
                    exit = !exit;
                    break;
            }
        }

    }
}