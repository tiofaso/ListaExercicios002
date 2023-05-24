import java.text.DecimalFormat;
import java.util.Scanner;

//Código para exibir a média aritimética de quatro notas inseridas aleatoriamente
public class Exercicio02MediaAritimetica {
    public static void main(String[] agrs){
        //Locale.setDefault(Locale.US); //permite inserir números com ponto (.) para dividir casa decimal

        System.out.println("Vamos calcular a sua média desse ano?\nInsira a nota do 1º bimestre:");

        //Lendo a nota do primeiro bimestre
        Scanner notaPrimeiroBimestre = new Scanner(System.in);
        double primeiroBimestre = notaPrimeiroBimestre.nextDouble();

        System.out.println("Insira a nota do 2º bimestre:");

        //Lendo a nota do segundo bimestre
        Scanner notaSegundoBimestre = new Scanner(System.in);
        double segundoBimestre = notaSegundoBimestre.nextDouble();

        System.out.println("Insira a nota do 3º bimestre:");

        //Lendo a nota do terceiro bimestre
        Scanner notaTerceiroBimestre = new Scanner(System.in);
        double terceiroBimestre = notaTerceiroBimestre.nextDouble();

        System.out.println("Insira a nota do 4º bimestre:");

        //Lendo a nota do quarto bimestre
        Scanner notaQuartoBimestre = new Scanner(System.in);
        double quartoBimestre = notaQuartoBimestre.nextDouble();

        //Arredontando a nota final
        DecimalFormat notaArredondada = new DecimalFormat("0.00");

        double notaFinal = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre)/4;
        System.out.println("A sua média final é: " + notaArredondada.format(notaFinal));
    }
}
