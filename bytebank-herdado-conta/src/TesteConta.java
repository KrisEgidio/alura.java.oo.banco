
public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente contaCorrente = new ContaCorrente(111,111);
		ContaPoupanca contaPoupanca = new ContaPoupanca(222,222);
		
		contaCorrente.deposita(200);
		contaPoupanca.deposita(300);
		
		contaCorrente.transfere(20, contaPoupanca);
		
		System.out.println(contaCorrente.getSaldo());
		
	}

}
