package mousebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Conta primeiraConta = new Conta();
		 
		 /* primeiraConta.saldo = 200.9; primeiraConta.agencia = 1209;
		 * primeiraConta.titular = "Guilherme";
		 * System.out.println("O saldo da conta �: " + primeiraConta.saldo);
		 * 
		 * primeiraConta.saldo +=100; System.out.println(primeiraConta.saldo);
		 * 
		 * Conta segundaConta = new Conta();
		 * 
		 * segundaConta.saldo = 1.99; 
		 * System.out.println("O saldo da segunda conta �: "* +segundaConta.saldo);
		 */
		
		
		primeiraConta.deposita(5000);
		System.out.println(primeiraConta.saldo);
		
		//segunda forma de fazer m�todos
		boolean conseguiuRetirar = primeiraConta.saca(6000);
		System.out.println(conseguiuRetirar);
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(1000);
		
		
		// transferir um valor de uma conta para a outra utilizando um m�todo
		
		System.out.println("Realizando transfer�ncia:");
		
		if(segundaConta.transfere(1500, primeiraConta)){
			System.out.println("Transfer�ncia OK!");
		}else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println("O saldo da segunda conta �: "+segundaConta.saldo);
		System.out.println("O saldo da primeira conta �: "+primeiraConta.saldo);
		
		
		primeiraConta.titular = "Guilherme";
		System.out.println(primeiraConta.titular);
	}

}
