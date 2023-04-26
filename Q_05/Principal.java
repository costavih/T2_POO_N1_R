package Q_05;
import java.util.Scanner;
public class Principal {
	  public static void main(String[] args) {
	        double num1,num2,media,subtracao,multipli,divisao; int opcao;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o Primeiro numero:");
	        num1 = sc.nextDouble();
	        System.out.println("Digite o Segundo numero:");
	        num2 = sc.nextDouble();
	        System.out.println("\t1- Media dos numeros");
	        System.out.println("\t2- Diminuir");
	        System.out.println("\t3- Multiplicar");
	        System.out.println("\t4- Divisao");
	        System.out.println("Digite a Operacao que deseja:");
	        opcao = sc.nextInt();
	        if(opcao >= 5){
	            System.out.println("Opcao invalida");
	        }else{
	             switch(opcao){
	            case 1:
	                media = (num1+num2) / 2;
	                System.out.println("A media dos numeros e " + media);
	                break;
	            case 2:
	                subtracao = num1 - num2;
	                System.out.println("A Subtracao entre os numeros e " + subtracao);
	                break;
	            case 3:
	                multipli = num1 * num2;
	                System.out.println("A Multiplicacao entre os numeros e " + multipli);
	                break;
	            case 4:
	                divisao = num1 / num2;
	                if(num2 != 0){
	                    System.out.println("A Divisao entre os numeros e " + divisao);
	                    break;
	                }else{
	                    System.out.println("Nao pode dividir com zero");
	                }
	            }
	        }
	       
	    }
	}

