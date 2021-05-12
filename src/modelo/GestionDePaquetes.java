package modelo;

import java.util.ArrayList;

public class GestionDePaquetes implements Seguro {

	ArrayList<Seguro> seguros = new ArrayList<Seguro>();

	@Override
	public void añadirSeguro(Seguro seguro) {
		seguros.add(seguro);
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
			costo += seguro.devolverCostoConDescuento();
		}

		return costo;
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
