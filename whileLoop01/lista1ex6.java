import java.util.Scanner;

public class lista1ex6 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while(num <= 0){
            System.out.print("DIGITE UM NUMERO: ");
            num = sc.nextInt();
        }
        System.out.print("SAIU DO WHILE");
    }
}
