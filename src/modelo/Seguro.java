package modelo;

public interface Seguro {
	double devolverCostoConDescuento();

	double devolverCostoSinDescuento();

	void añadirSeguro(Seguro seguro);

	int cantidadDeSegurosIncluidos();
}
