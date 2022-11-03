
public class Professor {

	String nome;
	String disciplina;
	double salario;
	double aumento;
	double sf;
	
	
	public Professor(String nome, String disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
		
		
		
	}

	double aumentaSalario(){
		sf = salario + aumento;
		return sf;
}}
