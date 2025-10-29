//Criar um programa que receba um número inteiro que defina a condição de vezes que um laço de repetição irá executar. Logo após, mostre apenas os números pares.

import java.util.Scanner;

public class lista1ex5 {
    public static void main(String[] args) {
        int num, controle = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero:");
        num = sc.nextInt();
        
        while(num >= controle) {
            if( controle % 2 == 0){
                System.out.println(controle);
            }
            controle = controle + 1;
        }
        
    }
}
