package banco;

public class CriarConta {
	
	public static void main(String []args) {
		
		//sintaxe b�sica de instancia��o
		Conta primeiraConta = new Conta();
		
		//sintaxe b�sica de atribui��o de um atributo
		primeiraConta.saldo = 200;
		
		//sintaxe b�sica de acesso de um atributo de um objeto
		System.out.println(primeiraConta.saldo);
	}
	
}