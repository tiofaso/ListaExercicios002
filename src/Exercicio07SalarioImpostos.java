import java.util.Scanner;
//Calcula o salário líquido baseado nos descontos de impostos
public class Exercicio07SalarioImpostos {
        public static void main(String[] args){
            System.out.println("Digite o valor da sua hora de trabalho:");
            //Lendo o valor da hora trabalhada
            Scanner valorHora = new Scanner(System.in);
            double valorHoraTrabalhada = valorHora.nextDouble();

            System.out.println("Quantas horas você trabalhou esse mês?");
            //Lendo o valor da hora trabalhada
            Scanner horaTrabalhadaMes = new Scanner(System.in);
            double valorHoraTrabalhadaMes = horaTrabalhadaMes.nextDouble();

            double salarioBruto = valorHoraTrabalhada * valorHoraTrabalhadaMes;
            double salarioINSS = salarioBruto * 0.08;
            double salarioIR = salarioBruto * 0.11;
            double salarioSindcato = salarioBruto * 0.05;
            double salarioLiquido = salarioBruto - (salarioINSS + salarioSindcato + salarioIR);

            System.out.println("Esse mês o seu salário bruto será de R$" + salarioBruto +"\n");
            System.out.println("INSS descontado de R$" + salarioINSS +"\n");
            System.out.println("Contrinuição Sindical descontada de R$" + salarioSindcato +"\n");
            System.out.println("Imposto de Renda descontado de R$" + salarioIR +"\n");
            System.out.println("Esse mês o seu salário liquido será de R$" + salarioLiquido);

        }
}
