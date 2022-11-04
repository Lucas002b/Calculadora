package calculadora;

import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
	Scanner calc = new Scanner(System.in);
	
	Double valor1 ;
	Double valor2 ;
	
	System.out.println("Escolha a opcao que deseja: ");
	System.out.println("1.Soma");
	System.out.println("2.Subtracao");
	System.out.println("3.Multiplicacao");
	System.out.println("4.Divisao");
	
	int opcao = calc.nextInt();
	
	System.out.println("digite valor 1: ");
	valor1 = calc.nextDouble();
	
	System.out.println("digite valor 2: ");
	valor2 = calc.nextDouble();
	
	if (opcao == 1) {
		System.out.println("Resultado da soma= " + (valor1 + valor2));
	}
	
	else if (opcao ==2) {
		System.out.println("Resultado da subtracao= " + (valor1 - valor2));
	}
	
	else if (opcao ==3) {
		System.out.println("Resultado da multiplicacao= " + (valor1 * valor2));
	}
	
	else {
		System.out.println("Resultado da divisao= " + (valor1 / valor2));
	}
}
}
