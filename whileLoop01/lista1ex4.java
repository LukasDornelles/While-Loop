//Desenvolver um programa que peça um número ao usuário e imprima a tabuada desse número, de 1 a 10.

import java.util.Scanner;

public class lista1ex4 {
    public static void main(String[] args) {
        int num, controle = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        
        while(controle <=10){
            System.out.println(num + "x" + controle + " = " + (num*controle));
            controle = controle + 1;
        }
    }
}
