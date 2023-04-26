package Questão_06;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        System.out.print("Digite um número inteiro: ");
	        num = sc.nextInt();

	        if (num % 2 == 0) {
	            System.out.println(num + " é um número par.");
	        } else {
	            System.out.println(num + " é um número ímpar.");
	        }
	    }
	}

