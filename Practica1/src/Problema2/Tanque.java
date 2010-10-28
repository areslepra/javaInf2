package Problema2;

public class Tanque {
	public static final double capacidad = 5000.0;
	
	public double contenido;
	
	public Tanque() {
		this.contenido = capacidad;
	}
	
	public double getContenido() {
		return this.contenido;
	}
	
	public void agregar(double cantidad) {
		if(this.contenido + cantidad > capacidad) {
			this.contenido = capacidad;
		} else {
			this.contenido += cantidad;			
		}
	}
	
	public void sacar(double cantidad) {
		if(this.contenido - cantidad < 0) {
			this.contenido = 0;
		} else {
			this.contenido -= cantidad;			
		}
	}
	
	public void sacaMitad() {
		if(this.contenido > 0) {
			this.contenido /= 2;
		}
	}
}
