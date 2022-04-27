

public class CriarConta {
	
	public static void main(String []args) {
		
		//sintaxe básica de instanciação
		Conta primeiraConta = new ContaCorrente(1337, 24226);
		
		//sintaxe básica de atribuição de um atributo
		primeiraConta.deposita(200);
		
		//sintaxe básica de acesso de um atributo de um objeto
		//System.out.println(primeiraConta.getSaldo());
		
		//sintaxe para chamar um método
		Conta segundaConta = new ContaCorrente(1010, 7);
		segundaConta.deposita(50);
		
		//referência de classes diferentes
		Cliente novoCliente = new Cliente();
		novoCliente.setCpf("222.222.222-22");
		novoCliente.setNome("Kris");
		novoCliente.setProfissao("Developer");
		
		segundaConta.setTitular(novoCliente);
		System.out.println(segundaConta.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
		
	}
	
}
