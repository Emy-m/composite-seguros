package modelo;

public interface Seguro {
	double devolverCostoConDescuento();

	double devolverCostoSinDescuento();

	void aņadirSeguro(Seguro seguro);

	int cantidadDeSegurosIncluidos();
}
