package regresion_lineal;

import java.util.Scanner;

public class Regresion_lineal {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t[] = new int [7];
        int x[] = new int [7];
        float b, xprom, tprom, a, x2, opc1=0, opc2=0, opc3=0, opc4=0, opc5=0;
        
        //pedir los valores en minutos (x)
        System.out.println("Tiempo x:");
        for (int i=0; i<7; i++) {
            System.out.print("Digita el valor "+(i+1)+" del tiempo en minutos (x): ");
            x[i] = sc.nextInt();
        }
        //Pedir los valores en kilómetros (t)
        System.out.println("Distancia t:");
        for (int i=0; i<7; i++) {
            System.out.print("Digita el valor "+(i+1)+" de la distancia en kilómetros (t): ");
            t[i] = sc.nextInt();
        }
        
        //Sumas de Riemann de la fórmula para encontrar b
        for (int i=0; i<7; i++) {
            opc1 += x[i]*t[i];
            opc2 += x[i];
            opc3 += t[i];
            opc4 += (t[i]*t[i]);
            opc5 = (opc3*opc3);
        }
        b = ((7*opc1)-(opc2*opc3))/((7*opc4)-opc5);
        
        //Encontrar a
        xprom = opc2/7;
        tprom = opc3/7;
        a = xprom-(b*tprom);
        
        //Encontrar el pronóstico del periodo
        x2 = a+(b*22);
        System.out.println("Pronóstico del periodo t = "+x2);
    }
    
}
