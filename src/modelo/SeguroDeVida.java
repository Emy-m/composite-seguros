package modelo;

public class SeguroDeVida implements Seguro {

	private double costoDelSeguro;

	public SeguroDeVida(double costoDelSeguro) {
		this.costoDelSeguro = costoDelSeguro;
	}

	@Override
	public double devolverCostoConDescuento() {
		return costoDelSeguro;
	}

	@Override
	public double devolverCostoSinDescuento() {
		return costoDelSeguro;
	}

	@Override
	public void añadirSeguro(Seguro seguro) {
		// TODO Auto-generated method stub

	}

	@Override
	public int cantidadDeSegurosIncluidos() {
		return 1;
	}
}
