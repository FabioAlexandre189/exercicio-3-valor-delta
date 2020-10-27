
package valordelta_fabioalexandre;

import java.util.Scanner;

public class ValorDelta_FabioAlexandre {

  
    public static void main(String[] args) {
        Scanner entrada;
        double a, b, c, delta, x1, x2;
        entrada = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        a = entrada.nextDouble();
        System.out.print("Digite o Valor B: ");
        b = entrada.nextDouble();
        System.out.print("Digite o valor C: ");
        c = entrada.nextDouble();
        
            if (a==0);
            
                delta=Math.pow(b,2)-(4*a*c);
        
            if (delta > 0){
                x1=((b*-1)+Math.sqrt(delta))/2*a; 
                x2=((b*-1)+Math.sqrt(delta))/2*a;
                System.out.print("Raiz é X1"+x1+"E x2"+x2);
            }
       
            else if (delta==0){
            x1 = ((-b)+Math.sqrt(delta))/2*a;
            System.out.println("As raises são: "+x1);
            }
            else if (delta<0);
            System.out.println("A equação não possui resultados reais");
        
    }
    
}
