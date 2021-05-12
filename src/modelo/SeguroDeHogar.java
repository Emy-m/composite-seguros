package modelo;

public class SeguroDeHogar implements Seguro {

	private double costoDelSeguro;

	public SeguroDeHogar(double costoDelSeguro) {
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
	public void a�adirSeguro(Seguro seguro) {
		// TODO Auto-generated method stub

	}

	@Override
	public int cantidadDeSegurosIncluidos() {
		return 1;
	}
}
