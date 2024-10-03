package exercicio_modulo_10;

import java.util.Scanner;

public class Controle_fluxo {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Quais as notas do aluno?: ");
			double nota1 = s.nextDouble();
			double nota2 = s.nextDouble();
			double nota3 = s.nextDouble();
			double nota4 = s.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if (media >= 7 && media <=10) {
				System.out.println("Aprovado");
			} else if (media >= 5 && media <= 6) {
				System.out.println("Em recuperação");
			} else {
				System.out.println("Reprovado");
			}
				
			
			
			
		}
		
	}