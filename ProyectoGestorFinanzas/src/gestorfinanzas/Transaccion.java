package gestorfinanzas;

public class Transaccion {

	private String tipo; 
	private double monto;
	private String descripcion;
	
	public Transaccion (String tipo, double monto, String descripcion) {
		this.tipo=tipo;
		this.monto=monto;
		this.descripcion=descripcion;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	@Override 
	public String toString () {
		return tipo + " | $" + monto + " | " + descripcion;
	}

}
