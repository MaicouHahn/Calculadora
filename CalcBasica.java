package Calculadora2;

import java.util.Scanner;
public class CalcBasica {
        

    public CalcBasica(){
        int bt3;
        Scanner scan=new Scanner(System.in);

        boolean i=false;

        while(i!=true){
            System.out.print("\n0-Finalizar\n1-Calculadora Basica\n2-Calculadora Volumetrica\n");
            bt3=scan.nextInt();

            switch(bt3){

            case 0:
                System.out.print("\nObrigado por utilizar a Calculadora\n");
                i=true;
                break;

            case 1:
                System.out.print("\nCalculadora Basica Selecionada\n");  
                CalcBasic c2=new CalcBasic();
                break;

            case 2:
                System.out.print("\nCalculadora Volumetrica Selecionada\n");
                CalVolumetrica c1=new CalVolumetrica();
            break;

            default:
            System.out.println("Função invalida");

        
            }
        }
    }

}
