package cuentas;

/**
 * 
 * PRACTICA DEL TEMA 4. OPTIMIACI�N Y DOCUMENTACI�N
 * 
 */

public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;
		cuenta1 = new CCuenta("Antonio L�pez", "1000-2365-85-1230456789", 2500, 0);
		cuenta1.operativa_cuenta("retirar", 2300);
		cuenta1.operativa_cuenta("ingresar", 695);
		cuenta1.operativa_cuenta("ingreso", 695);
	}
}
