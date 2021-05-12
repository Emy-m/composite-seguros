package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SeguroTest {

	@Test
	public void costoDeLosPaquetesDeSeguro() {
		GestionDePaquetes paquetes = new GestionDePaquetes();

		Paquete basico = new Paquete("Paquete Basico", 0.05);
		Paquete medio = new Paquete("Paquete Medio", 0.05);
		Paquete avanzado = new Paquete("Paquete Avanzado", 0.05);

		SeguroDeAutomovil seguroAutomovil = new SeguroDeAutomovil(100);
		SeguroDeHogar seguroHogar = new SeguroDeHogar(125);
		SeguroDeVida seguroVida = new SeguroDeVida(150);
		SeguroMedico seguroMedico = new SeguroMedico(175);

		basico.añadirSeguro(seguroAutomovil);
		basico.añadirSeguro(seguroHogar);

		medio.añadirSeguro(basico);
		medio.añadirSeguro(seguroMedico);

		avanzado.añadirSeguro(medio);
		avanzado.añadirSeguro(seguroVida);

		paquetes.añadirSeguro(basico);
		paquetes.añadirSeguro(medio);
		paquetes.añadirSeguro(avanzado);

		// basico 100 + 125 = 225 * (1 - (0.05 * 2)) -> 225 * 0.9 = 202.5 (22.5)
		// medio 225 + 175 = 400 * (1 - (0.05 * 3)) -> 400 * 0.85 = 340 (60)
		// avanzado 400 + 150 = 550 * (1 - (0.05 * 4)) -> 550 * 0.8 = 440 (110)
		// total 202.5 + 340 + 440 = 982.5

		assertEquals(982.5, paquetes.devolverCostoConDescuento(), 0.01);
	}

	@Test
	public void costoDeUnPaqueteDeSeguro() {
		Paquete basico = new Paquete("Paquete Basico", 0.05);
		SeguroDeAutomovil seguroAutomovil = new SeguroDeAutomovil(100);
		SeguroDeHogar seguroHogar = new SeguroDeHogar(125);
		basico.añadirSeguro(seguroAutomovil);
		basico.añadirSeguro(seguroHogar);

		// basico 100 + 125 = 225 * (1 - (0.05 * 2)) -> 225 * 0.9 = 202.5 (22.5)

		assertEquals(202.5, basico.devolverCostoConDescuento(), 0.01);
	}

	@Test
	public void costoDeUnSeguro() {
		SeguroDeAutomovil seguroAutomovil = new SeguroDeAutomovil(100);

		assertEquals(100, seguroAutomovil.devolverCostoConDescuento(), 0.01);
	}
}
