package bytebank;

public class CriarConta {
	
	public static void main(String []args) {
		
		//sintaxe b�sica de instancia��o
		Conta primeiraConta = new Conta();
		
		//sintaxe b�sica de atribui��o de um atributo
		primeiraConta.deposita(200);
		
		//sintaxe b�sica de acesso de um atributo de um objeto
		//System.out.println(primeiraConta.getSaldo());
		
		//sintaxe para chamar um m�todo
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		
		//refer�ncia de classes diferentes
		Cliente novoCliente = new Cliente();
		novoCliente.setCpf("222.222.222-22");
		novoCliente.setNome("Kris");
		novoCliente.setProfissao("Developer");
		
		segundaConta.setTitular(novoCliente);
		System.out.println(segundaConta.getTitular().getNome());
		
	}
	
}
