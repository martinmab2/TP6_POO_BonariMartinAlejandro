package ar.edu.unju.fi.model;

import java.time.LocalDate;
import ar.edu.unju.fi.model.enumerados.EstadoCliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	private Long id;
	private String dni;
	private String nombre;
	private String correo;
	private String domicilio;
	private LocalDate fechaIngreso;
	private EstadoCliente EstadoCliente;
}
