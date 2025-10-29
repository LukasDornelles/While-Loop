import java.util.Scanner;
//Crie agora um laço de repetição com while que conte de 1 a 30 mas quando chegar em 21 mostre-o na impressão e encerre o programa.
public class lista1ex8 {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 30){
            if(num == 21){
                System.out.println(num + " ");
                break;
            }
            System.out.println(num + " ");
            num++;
        }
    }   
}