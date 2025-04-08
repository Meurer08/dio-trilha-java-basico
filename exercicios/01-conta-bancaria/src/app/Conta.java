package app;

public class Conta {
	private double saldo;
    private double chequeEspecial;
    private double chequeEspecialTotal; 

    public Conta (double saldo) {
        this.saldo =  saldo;

        if (saldo <= 500) this.chequeEspecial = 50.00d;
        else this.chequeEspecial = this.saldo * 0.5;
        
        this.chequeEspecialTotal = this.chequeEspecial;
    }

    public double getSaldo() {
        System.out.printf("Saldo em conta: R$%.2f \n", saldo);
        return saldo;
    }
    
    public void chequeEspecialInfo () {
    	System.out.println("Cheque Especial:");
    	System.out.printf("Total: R$%.2f\n", this.chequeEspecialTotal);
    	System.out.printf("Utilizado: R$%.2f\n", (this.chequeEspecialTotal - this.chequeEspecial));
    	System.out.printf("Disponível: R$%.2f\n", this.chequeEspecial);
    }

    public void depositar (double valorDeposito) {
        this.saldo += valorDeposito;
    }
    
    private void valorDisponivelSaque () {
    	double saldoSaque;
        if (saldo > 0) saldoSaque = this.saldo + this.chequeEspecial;
        else saldoSaque = this.chequeEspecial;
        
        System.out.printf("Saldo disponível para saque: R$%.2f\n", saldoSaque);
    }

    private void debitarSaldo (double valorDebito) {
        this.saldo = this.saldo - valorDebito;
    }
    
    private void debitarChequeEspecial(double valorDebito) {
    	this.chequeEspecial -= valorDebito;
    	this.saldo -= (valorDebito * 1.20);
    }

    public void sacar (double valorSaque) {
        valorDisponivelSaque();
    	if (this.saldo >= 0 && (this.chequeEspecial + this.saldo) >= valorSaque) {
        	if (valorSaque <= this.saldo) {
        		debitarSaldo(valorSaque);
        		System.out.println("Saque liberado, utilizado valor em conta.");
        	} else {
                valorSaque -= this.saldo;
        		debitarSaldo(this.saldo);
        		debitarChequeEspecial(valorSaque);
        		System.out.printf("Saque liberado, utilizado R$%.2f de cheque especial.\n", valorSaque);
        	}
    	} else if (this.chequeEspecial >= valorSaque) {
    		debitarChequeEspecial(valorSaque);
    		System.out.printf("Saque liberado, utilizado R$%.2f de cheque especial.\n", valorSaque);
    	} else {
    		System.out.println("Sem saldo disponível para sacar este valor.");
    	}
    }
 }
    
