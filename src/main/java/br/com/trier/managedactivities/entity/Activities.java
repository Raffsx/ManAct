package br.com.trier.managedactivities.entity;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Builder
@Table(name = "activities", uniqueConstraints = { @UniqueConstraint(columnNames = { "uuid" }) })
@AllArgsConstructor
@NoArgsConstructor
public class Activities {

	private static final long serialVersionUID = -2300301058880605878L;

	@Id
	@GeneratedValue(generator = "system-uuid", strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", updatable = false)
	private UUID uuid;

	@NotNull(message = "Informe o nome da atividade")
	private String name;

	@ManyToOne
	@JoinColumn(name = "situation_uuid", nullable = false)
	private Situation situation;

	@NotNull(message = "Preencha a descrição da atividade")
	private String description;

	@ManyToOne
	@JoinColumn(name = "uuid_type", nullable = false)
	@NotNull(message = "Informe o tipo da atividade")
	private Type type;

}
