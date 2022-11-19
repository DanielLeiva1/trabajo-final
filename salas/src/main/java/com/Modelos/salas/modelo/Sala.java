package com.Modelos.salas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter 
public class Sala {
	
	@Id
	@Required
	@Column(length=4)
	int idsala;
	
	@Required
	@Column(length=20)
	String nombresala;
}
