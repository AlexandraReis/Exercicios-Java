package teste;

import java.util.Scanner;

public class exerciciowhile {

    public static void main(String[] args) {
        
        int numeros,contPar=0,contImpar=0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nEntre com um n�mero: ");
        numeros = ler.nextInt();
        
        while(numeros!= -99) {
            if(numeros % 2 == 0) {
                contPar++;
            }else {
                contImpar++;
            }
            System.out.println("\nEntre com um n�mero: ");
            numeros = ler.nextInt();
        }
        System.out.println("\nN�s temos: "+contPar+" n�meros pares");
        System.out.println("\nN�s temos: "+contImpar+" n�meros �mpares");
    }

}
