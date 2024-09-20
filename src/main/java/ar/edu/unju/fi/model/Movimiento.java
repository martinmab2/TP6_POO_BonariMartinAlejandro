package ar.edu.unju.fi.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Movimiento {
	private Long idMovimiento;
	private LocalDate fechaDeMovimiento;
	private CuentaBancaria cuentaBancaria;
	private boolean tipoDeMovimiento;
	private double importeDeDinero;
}
