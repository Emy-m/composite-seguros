package modelo;

public interface Seguro {
	double devolverCostoConDescuento();

	double devolverCostoSinDescuento();

	void a�adirSeguro(Seguro seguro);

	int cantidadDeSegurosIncluidos();
}
