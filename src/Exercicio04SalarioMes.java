import java.util.Scanner;

//Recebe o valor de horas trabalhadas e mostra o valor final do salário bruto
public class Exercicio04SalarioMes {
    public static void main(String[] args){
        System.out.println("Digite o valor da sua hora de trabalho:");
        //Lendo o valor da hora trabalhada
        Scanner valorHora = new Scanner(System.in);
        double valorHoraTrabalhada = valorHora.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês?");
        //Lendo o valor da hora trabalhada
        Scanner horaTrabalhadaMes = new Scanner(System.in);
        double valorHoraTrabalhadaMes = horaTrabalhadaMes.nextDouble();

        double salarioMes = valorHoraTrabalhada * valorHoraTrabalhadaMes;

        System.out.println("Esse mês o seu salário bruto será de R$" + salarioMes);

    }
}
