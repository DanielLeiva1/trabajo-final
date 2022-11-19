package com.Modelos.salas.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Usuario {
	@Id
	@Column(length = 10)
	Long cedula;

	@Column(length = 60)
	String nombrecliente;
}
