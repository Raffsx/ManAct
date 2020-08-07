package br.com.rafael.managedactivities.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@Entity
@Setter
@Getter
@Table(name = "type_act")
public class Type {

	private static final long serialVersionUID = 1359561820576023113L;

	@Id
	@GeneratedValue(generator = "system-uuid", strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", updatable = false)
	private UUID uuid;

	@NotNull(message = "Nome do tipo é um campo obrigatório")
	@Column(name = "name", nullable = false)
	private String name;

}
