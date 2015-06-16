package javaapplication1;

import newpackage.claseDOS;

public class JavaApplication1 {
    
    private int contador = 0;

    public static void main(String[] args) {

        JavaApplication1 jpl = new JavaApplication1();
        
        
        
        for (jpl.contador = 0; jpl.contador< 10; jpl.contador++) {
            System.out.println("imprimiendo el contador\n\n"+jpl.contador);
        }

        
        claseDOS cd1 = new claseDOS();
        System.out.println("atributos claseDos "+cd1.otraCosa);
        
        ClaseTres ct1 = new ClaseTres();
        System.out.println("atributos claseTres "+ct1.prot);
        System.out.println("atributos claseTres "+ct1.j);
    }

}
