package cuentas;

public class Main {

	public static void operativa_cuenta(CCuenta cuenta1, String operacion, float cantidad) {

		System.out.println("El saldo actual es " + cuenta1.getSaldo());

		switch (operacion) {
		case ("retirar"):
			try {
				cuenta1.retirar(cantidad);
				System.out.println("RETIRAR " + cantidad + " -> El saldo actual es " + cuenta1.getSaldo());

			} catch (Exception e) {
				System.out.print("Fallo al retirar");
			};
			break;
		case ("ingresar"):
			try {
				//System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
				System.out.println("INGRESO " + cantidad +  "-> El saldo actual es " + cuenta1.getSaldo());
			} catch (Exception e) {
				System.out.print("Fallo al ingresar");
			};
			break;
		}
	}

	public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, "retirar", 2300);
        operativa_cuenta(cuenta1, "ingresar", 695);
    }
}
