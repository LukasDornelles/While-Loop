import java.util.Scanner;
// um laço de repetição com while que calcule a média de uma série de notas informadas pelo usuário. O usuário deve digitar -1 para indicar o fim da entrada de notas e deve imprimir a média aritmética
public class lista1ex9 {
    public static void main(String[] args) {
         double nota, somaNotas = 0.0, qtdeNotas = 0.0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite as notas dos alunos.");
         System.out.println("Para encerrar digite -1");
         while(true) {
             System.out.println("Digite as notas: ");
             nota = sc.nextDouble();
             if (nota == -1){
                 break;
             }
             somaNotas += nota;
             qtdeNotas++;
         }
         
    }
}
