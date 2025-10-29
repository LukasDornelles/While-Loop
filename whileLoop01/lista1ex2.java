//Imprima todos os números pares de 1 a 100. E depois, imprima os números ímpares de 101 a 200.

public class lista1ex2 {
    public static void main(String[] args) {
        int i = 101; // comentar apenas para visualizar o commit
        while(i < 200){
            System.out.println(i+ " ");
            i = i + 2;
        }
        int j = 100;
        while(j < 200){
            System.out.println(j + " ");
            j = j + 2;
        }
    }
}
