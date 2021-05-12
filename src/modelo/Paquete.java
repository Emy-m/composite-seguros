package modelo;

import java.util.ArrayList;

public class Paquete implements Seguro {

	private String nombreDelPaquete;
	private double porcentajeDeDescuentoPorSeguroIncluido;
	ArrayList<Seguro> seguros = new ArrayList<Seguro>();

	public Paquete(String nombreDelPaquete, double porcentajeDeDescuentoPorSeguroIncluido) {
		this.nombreDelPaquete = nombreDelPaquete;
		this.porcentajeDeDescuentoPorSeguroIncluido = porcentajeDeDescuentoPorSeguroIncluido;
	}

	@Override
	public void añadirSeguro(Seguro seguro) {
		seguros.add(seguro);
	}

	private double aplicarDescuento(double costo) {
		double cantidadDeDescuento = cantidadDeSegurosIncluidos() * porcentajeDeDescuentoPorSeguroIncluido;
		return costo * (1 - cantidadDeDescuento);
	}

	@Override
	public int cantidadDeSegurosIncluidos() {
		int cantidad = 0;

		for (Seguro seguro : seguros) {
			cantidad += seguro.cantidadDeSegurosIncluidos();
		}

		return cantidad;
	}

	@Override
	public double devolverCostoConDescuento() {
		double costo = 0;

		for (Seguro seguro : seguros) {
			costo += seguro.devolverCostoSinDescuento();
		}

		return aplicarDescuento(costo);
	}

	@Override
	public double devolverCostoSinDescuento() {
		double costo = 0;

		for (Seguro seguro : seguros) {
			costo += seguro.devolverCostoSinDescuento();
		}

		return costo;
	}

}
