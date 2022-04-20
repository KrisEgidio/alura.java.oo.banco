
public class TesteClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente();
		gerente.setNome("Kris");
		gerente.setCpf("1111.111.111-11");
		gerente.setSalario(4500);
		gerente.setSenha(12345);
		
		//System.out.println(gerente.getNome());
		//System.out.println(gerente.getCpf());
		//System.out.println(gerente.getSalario());
		//System.out.println(gerente.getBonificacao());
		//System.out.println(gerente.autentica(1234));
		
		ControleBonificacao bonificacao = new ControleBonificacao();
		bonificacao.registra(gerente);
		System.out.println(bonificacao.getSoma());
		
		
	}

}
