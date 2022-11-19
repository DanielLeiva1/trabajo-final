package com.Modelos.salas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity 
@Getter @Setter 
public class Reservasala {
	@Id
	@Column(length=4)
	int id;

	@ManyToOne(
			fetch=FetchType.LAZY,
			optional=true)
	//@DescriptionsList
	Usuario usuario;

	
	@OneToOne(
			fetch=FetchType.LAZY,
			optional=true)
	//@DescriptionsList
	Sala sala;
	
	
	@Required
	@Column(length=20)
	@DefaultValueCalculator(CurrentDateCalculator.class)
	 private java.util.Date fecha;
	
	@Required
	@StringTime
	@Column(length=5)
	private String horainicio;
	
	@Required
	@StringTime
	@Column(length=5)
	private String horafin;
	
	
	@ManyToOne(
			fetch=FetchType.LAZY,
			optional=true)
	@DescriptionsList
	Estado estado;
	
	
	@Required
	@TextArea
	String motivo;
}
