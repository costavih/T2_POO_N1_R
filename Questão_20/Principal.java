package Questão_20;
import java.util.Scanner;
public class Principal {
	private int codigoProduto;
	   private double pesoKg;
	   private int codigoPais;
	   private double precoPorKg;

	   public Principal(int codigoProduto, double pesoKg, int codigoPais) {
	       this.codigoProduto = codigoProduto;
	       this.pesoKg = pesoKg;
	       this.codigoPais = codigoPais;

	       switch (codigoProduto) {
	           case 1:
	               precoPorKg = 10.0;
	               break;
	           case 2:
	               precoPorKg = 20.0;
	               break;
	           case 3:
	               precoPorKg = 30.0;
	               break;
	           case 4:
	               precoPorKg = 40.0;
	               break;
	           case 5:
	               precoPorKg = 50.0;
	               break;
	           case 6:
	               precoPorKg = 60.0;
	               break;
	           case 7:
	               precoPorKg = 70.0;
	               break;
	           case 8:
	               precoPorKg = 80.0;
	               break;
	           case 9:
	               precoPorKg = 90.0;
	               break;
	           case 10:
	               precoPorKg = 100.0;
	               break;
	           default:
	               precoPorKg = 0.0;
	               break;
	       }
	   }

	   public double getPesoGramas() {
	       return pesoKg * 1000.0;
	   }

	   public double getPrecoTotal() {
	       return precoPorKg * pesoKg;
	   }

	   public double getImposto() {
	       double imposto;
	       switch (codigoPais) {
	           case 1:
	               imposto = getPrecoTotal() * 0.10;
	               break;
	           case 2:
	               imposto = getPrecoTotal() * 0.15;
	               break;
	           case 3:
	               imposto = getPrecoTotal() * 0.20;
	               break;
	           default:
	               imposto = 0.0;
	               break;
	       }
	       return imposto;
	   }

	   public double getPrecoTotalComImposto() {
	       return getPrecoTotal() + getImposto();
	   }

	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       System.out.print("Digite o código do produto: ");
	       int codigoProduto = scanner.nextInt();

	       System.out.print("Digite o peso do produto em kg: ");
	       double pesoKg = scanner.nextDouble();

	       System.out.print("Digite o código do país de origem: ");
	       int codigoPais = scanner.nextInt();

	       Principal compra = new Principal(codigoProduto, pesoKg, codigoPais);

	       System.out.printf("Peso do produto em gramas: %.2f g\n", compra.getPesoGramas());
	       System.out.printf("Preço total do produto: R$ %.2f\n", compra.getPrecoTotal());
	       System.out.printf("Valor do imposto: R$ %.2f\n", compra.getImposto());
	       System.out.printf("Valor total da compra: R$ %.2f\n", compra.getPrecoTotalComImposto());

	       scanner.close();
	   }
	}

