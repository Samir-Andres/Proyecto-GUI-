package controller;

public class CuentaBancaria {

	private  String nombreTitular;
	private  String apellidoTitular;
	private  int numeroCuenta;
	private  float saldo;
	private  String tipoCuenta;
	
	public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta,
			float saldo) {
		super();
		this.nombreTitular = nombreTitular;
		this.apellidoTitular = apellidoTitular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		

		
	}
	
	
	public CuentaBancaria(String tipoCuenta) {
		super();
		this.tipoCuenta = tipoCuenta;
	}
	
	
	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

// primer Contructor
	
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getApellidoTitular() {
		return apellidoTitular;
	}
	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getTipoDeCuenta() {
		return tipoCuenta;
	}
	public void setTipoDeCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	
	
}
