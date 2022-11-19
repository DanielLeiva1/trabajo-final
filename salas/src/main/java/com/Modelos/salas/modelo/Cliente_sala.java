package com.Modelos.salas.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter 
public class Cliente_sala {
	
	@Id
	@Column(length = 4)
	int idcliente;

	@Column(length = 60)
	String nombrecliente;
}
