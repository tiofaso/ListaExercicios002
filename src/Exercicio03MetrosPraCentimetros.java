import java.text.DecimalFormat;
import java.util.Scanner;

//Converte mestros para centímetros
public class Exercicio03MetrosPraCentimetros {
    public static void main(String[] args){
        System.out.println("Digite a medida que você quer converter:");

        //Lendo a media em metros
        Scanner valorMetros = new Scanner(System.in);
        double emMetros = valorMetros.nextDouble();

        double emCentimetros = emMetros * 100;

        //Arredontando da medida
        DecimalFormat medidaArredondada = new DecimalFormat("0.00");


        System.out.println(emMetros + " metros é aproximadamente " + medidaArredondada.format(emCentimetros) + " em centímetros");
    }
}
