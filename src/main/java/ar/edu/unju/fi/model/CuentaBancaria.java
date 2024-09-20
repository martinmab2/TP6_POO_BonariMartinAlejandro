package ar.edu.unju.fi.model;

import java.time.LocalDate;

import ar.edu.unju.fi.model.enumerados.EstadoCuenta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuentaBancaria {
	private Long id;
	private Long numeroDeCuenta;
	private Cliente cliente;
	private LocalDate fechaDeCreacion;
	private double saldoActual;
	private EstadoCuenta estadocuenta;
	private double limiteExtraccion;
}
