import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Professor p1 = new Professor("Jordan","TI");
		
		Professor p2 = new Professor("Clemilton","TI");
		
		Professor p3 = new Professor("Felipe","TI");
		
		Scanner entrada = new Scanner(System.in);
		  System.out.println("Escolha um Professor de 1 a 3: ");
		  int numero = entrada.nextInt();
		   switch (numero) {
		     case 1:
		       System.out.println("O Professor escolhido foi: Jordan.");
		       
		       System.out.println("Salario Inicial :");
				 p1.salario = scan.nextDouble();
				   
				System.out.println("Seu aumento � de :");
				p1.aumento = scan.nextDouble();
				
				p1.aumentaSalario();
				System.out.println("Ol� "+ p1.nome + " seu salario final �: "+ p1.aumentaSalario());
		      
				break;
		       
		     case 2:
		       System.out.println("O Professor escolhido foi: Clemilton.");
		              
		       System.out.println("Salario Inicial :");
				 p2.salario = scan.nextDouble();
				   
				System.out.println("Seu aumento � de :");
				p2.aumento = scan.nextDouble();
				
				p2.aumentaSalario();
				System.out.println("Ol� "+ p2.nome + " seu salario final �: "+ p2.aumentaSalario());
		       
		       break;
		       
		     case 3:
		       System.out.println("O Professor escolhido foi: Felipe.");
		    		       
		       System.out.println("Salario Inicial :");
				 p3.salario = scan.nextDouble();
				   
				System.out.println("Seu aumento � de :");
				p3.aumento = scan.nextDouble();
				
				p3.aumentaSalario();
				System.out.println("Ol� "+ p3.nome + " seu salario final �: "+ p3.aumentaSalario());
		       
		       break;
		     default:
		         System.out.println("N�o existe um Professor correspondente ao n�mero escolhido! Digite um n�mero entre 1 a 3.");
		   }
		   
		 
	}
	
}
