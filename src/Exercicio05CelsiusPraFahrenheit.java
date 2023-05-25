import java.util.Scanner;

//Converte Celsius para fahrenheit sem usar função pronta
public class Exercicio05CelsiusPraFahrenheit {
        public static void main(String[] args){
            System.out.println("Digite a temperatura:");
            //Lendo o valor da temperatura em Celsius
            Scanner tempCelsius = new Scanner(System.in);
            double temperaturaCelsius = tempCelsius.nextDouble();

            double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

            System.out.println(temperaturaCelsius + "ºC equivale a " + temperaturaFahrenheit + "ºF");

        }
}
