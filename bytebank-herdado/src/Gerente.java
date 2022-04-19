//Gerente herda da classe funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} return false;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//"super" indica que o atributo na classe mãe
	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}
	
}