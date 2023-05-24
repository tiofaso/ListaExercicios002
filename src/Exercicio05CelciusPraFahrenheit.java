import java.util.Scanner;

//Converte celcius para fahrenheit sem usar função pronta
public class Exercicio05CelciusPraFahrenheit {
        public static void main(String[] args){
            System.out.println("Digite a temperatura:");
            //Lendo o valor da temperatura em celcius
            Scanner tempCelsius = new Scanner(System.in);
            double temperaturaCelcius = tempCelsius.nextDouble();

            double temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;

            System.out.println(temperaturaCelcius + "ºC equivale a " + temperaturaFahrenheit + "ºF");

        }
}
