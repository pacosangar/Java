package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        	setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        	setSaldo(getSaldo() - cantidad);
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
