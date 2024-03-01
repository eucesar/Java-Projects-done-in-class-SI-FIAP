package ex2;

public class Main {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Maria Luiza";
		funcionario.cargo = "gerente";
		funcionario.salario = 25000;
		
		// aplicar 10% de aumento
		funcionario.aumentarSalario(10); //n posso imprimir direto pq é void
		System.out.println(funcionario.salario);
		
		// aplicar 10% de aumento somente para os gerentes
		funcionario.aumentarSalario(10, "gerente");
		System.out.println(funcionario.salario);
		
		// promover o funcionario
		funcionario.promover("diretor");
		System.out.println(funcionario.cargo);
		
	}

}
