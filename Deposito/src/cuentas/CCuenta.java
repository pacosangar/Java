package cuentas;

public class CCuenta {

	/* Atributos de mi clase */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public CCuenta() {
		System.out.println("Constructor cuenta 2");
	}

	public CCuenta(String inNombre, String inCuenta, double inSaldo, double inTipoInteres) {
		this.setNombre(inNombre);
		this.setCuenta(inCuenta);
		this.setSaldo(inSaldo);
		this.setTipoInteres(inTipoInteres);
	}

	public void operativa_cuenta(String operacion, float cantidad) {

		System.out.println("El saldo actual es " + this.getSaldo());

		switch (operacion) {
		case ("retirar"):
			try {
				this.retirar(cantidad);
				System.out.println("RETIRAR " + cantidad + " -> El saldo actual es " + this.getSaldo());

			} catch (Exception e) {
				System.out.print("Fallo al retirar");
			}
			;
			break;
		case ("ingresar"):
			try {
				// System.out.println("Ingreso en cuenta");
				this.ingresar(cantidad);
				System.out.println("INGRESO " + cantidad + "-> El saldo actual es " + this.getSaldo());
			} catch (Exception e) {
				System.out.print("Fallo al ingresar");
			}
			;
			break;
		default:
			System.out.println("Operación no VALIDA");
			break;
		}// Fin de switch

	}

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		this.setSaldo(this.getSaldo() + cantidad);
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (this.getSaldo() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		this.setSaldo(this.getSaldo() - cantidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String inputNombre) {
		nombre = inputNombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String inputCuenta) {
		cuenta = inputCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double inputSaldo) {
		saldo = inputSaldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double inputTipoInteres) {
		tipoInteres = inputTipoInteres;
	}
}
