package Calculadora2;
import java.util.Scanner;
public class CalcBasic {

public CalcBasic(){

        Scanner scan=new Scanner(System.in);
            
            int bt1;

            float[] n=new float[3];

            boolean i=false;
            
            while(i!=true)
            {
            System.out.println("\n\nCalculadora basica:\n0- Encerrar\n1- Soma\n2- Sub\n3- Div\n4- Mult\n5- Porcentagem\n");
            bt1=scan.nextInt(); 

            switch(bt1){

           
            case 0:
                i=true;
                break;

            case 1://soma
                System.out.println("Digite o primeiro numero da soma:");
                n[0]=scan.nextFloat();
                System.out.println("Digite o segundo numero da soma:");
                n[1]=scan.nextFloat();
                System.out.printf("%.2f mais %.2f é: %.2f",n[0],n[1],soma(n[0], n[1]));
                break;

            case 2://subtraçao
                System.out.println("Digite o numero que vai receber a subtração:");
                n[0]=scan.nextFloat();
                System.out.println("Digite o numero que vai subtrair:");
                n[1]=scan.nextFloat();
                System.out.printf("%.2f menos %.2f é: %.2f",n[0],n[1],sub(n[0], n[1]));
                break;

            case 3://divisao
                System.out.println("Digite o numero a ser dividido:");
                n[0]=scan.nextFloat();
                System.out.println("Digite o divisor:");
                n[1]=scan.nextFloat();
                System.out.printf("%.2f dividido por %.2f é: %.2f",n[0],n[1],div(n[0], n[1]));
                break;

            case 4://Multiplicaçao
                System.out.println("Digite o numero multiplicador:");
                n[0]=scan.nextFloat();
                System.out.println("Digite o numero a ser multiplicado:");
                n[1]=scan.nextFloat();
                System.out.printf("%.2f vezes %.2f é: %.2f",n[0],n[1],mult(n[0], n[1]));
                break;

            case 5://porcentagem
                System.out.println("Digite a porcentagem desejada sem o simbolo de % :");
                n[0]=scan.nextFloat();
                System.out.println("Digite o numero base utilizado:");
                n[1]=scan.nextFloat();
                System.out.printf("%.2f de %.2f é : %.2f resultado na soma de %.2f",n[0],n[1],porcentagem(n[0], n[1]),soma(porcentagem(n[0], n[1]), n[1]));
            break;

            default:
                System.out.println("Função invalida");

            }
        }

}



public static float soma(float a,float b){
            return a+b;
        }
public static float sub(float a,float b){
            return a-b;
        }
public static float div(float a,float b){
            return a/b;
        }
public static float mult(float a,float b){
            return a*b;
        }
public static float porcentagem(float a,float b){
            return ((a/100)*b);
        }

}
