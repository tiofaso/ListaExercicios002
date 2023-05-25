import java.util.Scanner;

//Converte celsius para fahrenheit sem usar função pronta
public class Exercicio08FahrenheitparaCelsius {
        public static void main(String[] args){
            System.out.println("Digite a temperatura:");
            //Lendo o valor da temperatura em Celsius
            Scanner tempCelsius = new Scanner(System.in);
            double temperaturaCelsius = tempCelsius.nextDouble();

            double temperaturaFahrenheit = (temperaturaCelsius - 32)/ 1.8;

            System.out.println(temperaturaCelsius + "ºF equivale a " + temperaturaFahrenheit + "ºC");

        }
}
