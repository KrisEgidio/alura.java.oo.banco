package banco;

public class CriarConta {
	
	public static void main(String []args) {
		
		//sintaxe b�sica de instancia��o
		Conta primeiraConta = new Conta();
		
		//sintaxe b�sica de atribui��o de um atributo
		primeiraConta.saldo = 200;
		
		//sintaxe b�sica de acesso de um atributo de um objeto
		System.out.println(primeiraConta.saldo);
		
		//sintaxe para chamar um m�todo
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		System.out.println(segundaConta.saldo);
		
		//refer�ncia de classes diferentes
		Cliente novoCliente = new Cliente();
		novoCliente.cpf = "222.222.222-22";
		novoCliente.nome = "Kris";
		novoCliente.profissao = "Developer";
		
		segundaConta.titular = novoCliente;
		System.out.println(segundaConta.titular.nome);
		
	}
	
}
