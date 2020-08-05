package br.com.trier.managedactivities.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@Entity
@Getter
@Setter
@Table(name = "situation_act")
public class Situation {

	@Id
	@GeneratedValue(generator = "system-uuid", strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", updatable = false)
	private UUID uuid;

	@NotNull(message = "É necessário nomear a situação")
	@Column(name = "name", nullable = false)
	private String name;

}
