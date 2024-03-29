package bytebank;

public class Conta {
	
	//atributo privado n�o pode ser modificado e nem lido a n�o ser pela pr�pria classe
	//encapsulamento
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;//Static quer dizer que o atributo � da classe e n�o dos objetos
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal(){
		return Conta.total;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}
