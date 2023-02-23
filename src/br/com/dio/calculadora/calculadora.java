package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int a, b;
		System.out.println("Digite o Primeiro valor: ");
		a = sca.nextInt();
		System.out.println("Digite o Segundo valor: ");
		b = sca.nextInt();

		int soma = soma(a, b);
		int sub = sub(a, b);
		double div = div(a, b);
		double multi = multi(a, b);

		System.out.println(soma);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(multi);

	}

	public static int soma(int a, int b) {
		return a + b;
	};

	public static int sub(int a, int b) {
		return a - b;
	};

	public static int div(int a, int b) {
		return a / b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

}
