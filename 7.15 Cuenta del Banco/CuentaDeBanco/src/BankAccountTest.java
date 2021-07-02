
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount pepe = new BankAccount(0, 1000);
		BankAccount pipo = new BankAccount(2000, 50000);
		BankAccount coto = new BankAccount(11000, 15000);
		BankAccount rolo = new BankAccount(1000000, 5000000);
		
		pepe.CuentaBanco(); 
		pipo.CuentaBanco();
		coto.CuentaBanco();
		rolo.CuentaBanco();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pepe.getSaldoCuentaAho();
		pipo.getSaldoCuentaAho();
		coto.getSaldoCuentaAho();
		rolo.getSaldoCuentaAho();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pepe.getSaldoCuentaCte();
		pipo.getSaldoCuentaCte();
		coto.getSaldoCuentaCte();
		rolo.getSaldoCuentaCte();
		System.out.println("||||||||||||||||||||||||Pepe||||||||||||||||||||||||||||||||||||||||");
		
		pepe.deposCtaAho(50000);
		pepe.getSaldoCuentaAho();
		pepe.getSaldoCuentaCte();
		pepe.total();
		
		System.out.println("||||||||||||||||||||||||Pipo||||||||||||||||||||||||||||||||||||||||");
		pipo.deposCtaAho(10000);
		pipo.giroCtaCte(6000);
		pipo.getSaldoCuentaAho();
		pipo.getSaldoCuentaCte();
		pipo.total();
		
		System.out.println("||||||||||||||||||||||||Coto||||||||||||||||||||||||||||||||||||||||");
		coto.deposCtaAho(8000);
		coto.giroCtaCte(20000);
		coto.getSaldoCuentaAho();
		coto.getSaldoCuentaCte();
		coto.total();
		
		System.out.println("||||||||||||||||||||||||Rolo||||||||||||||||||||||||||||||||||||||||");
		rolo.deposCtaCte(300000);
		rolo.giroCtaAho(1500000);
		rolo.getSaldoCuentaAho();
		rolo.getSaldoCuentaCte();
		rolo.total();

		
		
	}

}
