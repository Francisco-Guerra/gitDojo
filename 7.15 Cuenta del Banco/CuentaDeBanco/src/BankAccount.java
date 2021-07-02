import java.util.*;

public class BankAccount extends BankAccountTest{
	private String cuentaNum;
	private double saldoCuentaCte;
	private double saldoCuentaAho;
	private static int nCuentas = 0;
	private static double totalCuenta = 0;
	
	public BankAccount(double saldo1, double saldo2) {
		CrearNumCta();
		saldoCuentaAho = saldo1;
		saldoCuentaCte  = saldo2;
		nCuentas ++;
		totalCuenta += saldoCuentaCte;
		totalCuenta += saldoCuentaAho;
	}

	private String CrearNumCta() {
		String num = "1234567890";
		String numNuevo = "";
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			int numer = num.charAt(rand.nextInt(10));
			numNuevo += numer;
		}
		cuentaNum = numNuevo;
		return numNuevo;
	}
	
		protected String NumCta() {
		return cuentaNum;		
	}
		
		public int CuentaBanco() {
		System.out.println("Estimado "+this.toString()+ " Su número de cuenta bancaria es: "+cuentaNum);
		return nCuentas;		
	}
	
	public double getSaldoCuentaCte() {
		System.out.println("Saldo Disponible en la cuenta Corriente N°"+cuentaNum+" es de: $"+this.saldoCuentaCte);
		return saldoCuentaCte;
	}

	public void setSaldoCuentaCte(double saldoCuentaCte) {
		this.saldoCuentaCte = saldoCuentaCte;
	}

	public double getSaldoCuentaAho() {
		System.out.println("Saldo Disponible en la cuenta de Ahorro N°"+cuentaNum+" es de: $"+this.saldoCuentaAho);
		return saldoCuentaAho;
	}

	public void setSaldoCuentaAho(double saldoCuentaAho) {
		this.saldoCuentaAho = saldoCuentaAho;
	}
	
	public void deposCtaCte(double monto) {
		this.setSaldoCuentaCte(saldoCuentaCte + monto);
		totalCuenta += saldoCuentaCte;
		System.out.println("Depositando $"+monto+" a su Cta. Corriente");
	}
	public void deposCtaAho(double monto) {
		this.setSaldoCuentaAho(saldoCuentaAho + monto);
		totalCuenta += saldoCuentaAho;
		System.out.println("Depositando $"+monto+" a su Cta. de Ahorro");
	}
	public double total() {
		totalCuenta = saldoCuentaCte + saldoCuentaAho;
		System.out.println("Saldo total de la cuenta N° "+cuentaNum+" es de $"+totalCuenta);
		return totalCuenta;
	}
	
	public void giroCtaCte(int monto) {
		if(saldoCuentaCte < monto) {
			System.out.println("No tienes saldo suficiente para girar $"+monto+" de tu Cuenta Corriente");
		}else{
			setSaldoCuentaCte(saldoCuentaCte - monto);
			System.out.println("Usted ha girado $"+monto+" de su Cuenta Corriente");
		}
	}
	public void giroCtaAho(int monto) {
		if(saldoCuentaAho < monto) {
			System.out.println("No tienes saldo suficiente para girar $"+monto+" de tu Cuenta de Ahorro");
		}else {
			setSaldoCuentaAho(saldoCuentaAho - monto);
			System.out.println("Usted ha girado $"+monto+" de su Cuenta de Ahorro");
		}
	}	
}
