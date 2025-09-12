package exerciciospoo.banco;

public class Banco {
	private final int conta;
	private String titular;
	private double saldo;
	
	public Banco(int conta, String titular) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = 0;
    }
	
	public Banco(int conta, String titular, double depositoInicial) {
        this.conta = conta;
        this.titular = titular;
        depositar(depositoInicial);
    }
	
	public void depositar(double deposito) {
		
		if (deposito > 0) {
            this.saldo += deposito;
        }
	}
	
	public void sacar(double saque) {
		this.saldo -= (saque + 5);
	}

	public int getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	
	

}
