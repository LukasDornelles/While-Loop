import java.util.Scanner;

public class lista1ex7 {
    public static void main(String[] args) {
        int x = 1;
        while(x <= 20){
            if(x == 15){
                x++;
                continue; //ele ignora qualquer bloco que venha depois dele quando a condiço x = 15 v verdadeira
            }
            System.out.println(x + " ");
            x++;
        }
    }
}