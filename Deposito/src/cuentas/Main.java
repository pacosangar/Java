package cuentas;
public class Main {
	
	public static void operativa_cuenta(CCuenta cuenta, String operacion) {
		
	}

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        
        
        String miNombre = cuenta1.getNombre();
        System.out.println("Mi name " + miNombre);
        
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
