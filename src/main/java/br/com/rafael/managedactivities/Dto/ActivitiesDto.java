package br.com.rafael.managedactivities.Dto;

import br.com.rafael.managedactivities.entity.Situation;
import br.com.rafael.managedactivities.entity.Type;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivitiesDto {

	private static final long serialVersionUID = 8680417407555073874L;

	private UUID uuid;
	private String name;
	private String description;
	private Situation situation;
	private Type type;

}
