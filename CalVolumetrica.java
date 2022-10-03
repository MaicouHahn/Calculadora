package Calculadora2;

import java.util.Scanner;

public class CalVolumetrica {
    
    public CalVolumetrica(){

        boolean j=false;

                while( j !=true){

                    
                    double n1,n2,n3;
                    Scanner scan=new Scanner(System.in);
                    int bt2;

                    System.out.println("\n\nCalculadora de volumes\nQual volume deseja calcular?\n1- Cilindro\n2- Paralelepipedo\n3- Esfera\n4- Semi Esfera\n5- Cubo\n6- Cone\n7- Piramide\n8- Tronco de Cone\n9- Tronco de Piramide\n10- Prisma\n0- Finalizar\n");
                    
                    bt2=scan.nextInt();

                    switch(bt2){

                    
                    case 0://finalizar a calculadora de volume
                        
                        j=true;
                        break;
                    
                    case 1://cilindro
                        System.out.println("Digite o raio do cilindro: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite a altura do cilindro: ");
                        n2=scan.nextDouble();
                        System.out.format("Volume do cilindro é: %.2f",cilindro(n1, n2),"\n");
                    break;

                    case 2://paralelepipedo
                        System.out.println("Digite o comprimento do Paralelepipedo: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite a largura do Paralelepipedo: ");
                        n2=scan.nextDouble();
                        System.out.println("Digite a altura do Paralelepipedo: ");
                        n3=scan.nextDouble();
                        System.out.format("Volume do Paralelepipedo é: %.2f",paralelepipedo(n1, n2, n3),"\n");
                    break;
                    
                    case 3://esfera
                        System.out.println("Digite o raio da esfera: ");
                        n1=scan.nextDouble();
                        System.out.format("O volume da Esfera é: %.2f",esfera(n1));
                    break;

                    case 4://semi esfera
                        System.out.println("Digite o raio da Semi Esfera: ");
                        n1=scan.nextDouble();
                        System.out.format("O volume da Semi Esfera é: %.2f",semiEsfera(n1));
                    break;

                    case 5://cubo
                        System.out.println("Digite o Lado do cubo: ");
                        n1=scan.nextDouble();
                        System.out.format("O volume do Cubo é: %.2f",cubo(n1));
                    break;

                    case 6://cone
                        System.out.println("Digite o Raio da Base do Cone: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite a altura do Cone: ");
                        n2=scan.nextDouble();
                        System.out.format("O volume do Cone é: %.2f",cone(n1, n2));
                    break;

                    case 7://piramide
                        System.out.println("Digite o Lado da piramide equilatera: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite a altura da piramide: ");
                        n2=scan.nextDouble();
                        System.out.format("O volume da Piramide é: %.2f",piramide(n1, n2));
                    break;

                    case 8://tronco de cone
                        System.out.println("Digite o Raio Maior do tronco de Cone: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite o Raio Menor do tronco de Cone: ");
                        n2=scan.nextDouble();
                        System.out.println("Digite a Altura do tronco de Cone: ");
                        n3=scan.nextDouble();
                        System.out.format("O volume do Tronco de cone é: %.2f",troncodeCone(n1, n2, n3));
                    break;

                    case 9://tronco de piramide
                        System.out.println("Digite a Area da Base Maior: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite a Area da Base Menor: ");
                        n2=scan.nextDouble();
                        System.out.println("Digite a Altura: ");
                        n3=scan.nextDouble();
                        System.out.format("O volume do Tronco de Piramide é: %.2f",troncodePiramide(n1, n2, n3));
                    break;

                    case 10://prisma
                        System.out.println("Digite o lado do Prisma Equilatero: ");
                        n1=scan.nextDouble();
                        System.out.println("Digite a Altura do Prisma: ");
                        n2=scan.nextDouble();
                        System.out.format("O volume do prisma é: %.2f",prisma(n1, n2));
                    break;
                    
                    default:
                    System.out.println("Função invalida");
    
                
                }
                }
    
            }





public static double cilindro(double raio,double altura)
{  
    double areaBase= 3.14*(raio*raio);

    return areaBase*altura;

}
public static double paralelepipedo(double comprimento,double largura, double altura)
{
    double areaBase=comprimento*largura;

    return areaBase*altura;
}
public static double esfera(double raio){
    
    return ((4*3.14*raio*raio*raio)/3);
}
public static double semiEsfera(double raio){

    return (((4*3.14*raio*raio*raio)/3)/2);
}
public static double cubo(double lado){
    return lado*lado*lado;
}
public static double cone(double raio,double altura){
    
    double areadaBase= 3.14*raio*raio;

    return (areadaBase*altura)/3;
}
public static double piramide(double lado,double altura){
    
    double areadaBase= lado*lado;

    return (areadaBase*altura)/3;
}
public static double troncodeCone(double raioMaior,double raioMenor,double altura){
    double volume= (3.14*altura*((raioMaior*raioMaior)+(raioMenor*raioMenor)+(raioMaior*raioMenor)))/3;
    return volume;
}
public static double troncodePiramide(double areaBaseMaior,double areaBaseMenor,double altura){
    double volume= altura/3*(areaBaseMaior+areaBaseMenor+Math.sqrt(areaBaseMaior*areaBaseMenor));
    return volume;
}
public static double prisma(double lado,double altura){
    double areaBase=(((lado*lado)*Math.sqrt(3))/4);

    return areaBase*altura;

}

        }
