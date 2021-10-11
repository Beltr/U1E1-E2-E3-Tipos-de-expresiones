package Expresion;

import java.util.ArrayList;
import java.util.Stack;

public class ExpresinoLogica {

    public ExpresinoLogica() {
        System.out.println("[(p->q)^p]->q");
        String p[] = {"V", "V", "F", "F"};
        String q[] = {"V", "F", "V", "F"};

        String[] Op1 = new String[4];
        String[] Op2 = new String[4];
        String[] Op3 = new String[4];

        //Condicional primera parte (p->q)
        for (int i = 0; i < p.length; i++) {
            if(p[i].equals("V") && q[i].equals("F")) {
                  Op1[i] = "F";} else {Op1[i] = "V";}
        }
        //Conjucional segunda parte [(p->q)^p
        for (int i = 0; i < p.length; i++) { 
            if(Op1[i].equals("V") && p[i].equals("V")) {
                    Op2[i] = "V";} else {Op2[i] = "F";}
        }
        System.out.println("Valor | Resultado");
        System.out.println("p " + "  " + "q" +" |  "+ "[(p->q)^p]->q");
        
        //Condicionl tercera parte [(p->q)^p]->q
        for (int i = 0; i < q.length; i++) {
            if (Op2[i].equals("V") && q[i].equals("F")) {
                Op3[i] = "F";}else{Op3[i] = "V";
            }
            System.out.println(p[i] + "   " + q[i] + " |       " + Op3[i]);
        }
    }
}
