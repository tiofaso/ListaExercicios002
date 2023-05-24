import java.util.Scanner;
//Lê qualquer número inteiro e mostra o seu sucessor e seu antecessor
public class Exercicio06InteiroAntesDepois {
        public static void main(String[] args){
            System.out.println("Digite um número:");
            //Lendo o valor da temperatura em celcius
            Scanner numeroEscrito = new Scanner(System.in);
            int numeroInteiro = numeroEscrito.nextInt();

            int numeroAntecessor = numeroInteiro - 1;
            int numeroSucessor = numeroInteiro + 1;

            System.out.println("O número antecessor a " + numeroInteiro + " é o " + numeroAntecessor + " e o seu sucessor é o " + numeroSucessor);

        }
}
