package banco;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//exemplo de m�todo do tipo conta
	//m�todo sem retorno
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//m�todo que retorna um boolean
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	//utilizando os m�todos da pr�pria classe
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
}
