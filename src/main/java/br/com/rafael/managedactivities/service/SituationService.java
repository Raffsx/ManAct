package br.com.rafael.managedactivities.service;

import br.com.rafael.managedactivities.Dto.SituationDto;
import br.com.rafael.managedactivities.entity.Situation;
import br.com.rafael.managedactivities.repository.SituationRepository;
import br.com.rafael.managedactivities.mapper.Mappable;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SituationService implements Mappable {

	private final SituationRepository situationRepository;
	private final ModelMapper mapper;

	@Autowired
	public SituationService(SituationRepository situationRepository, ModelMapper mapper) {
		this.situationRepository = situationRepository;
		this.mapper = mapper;
	}

	public Situation create(Situation situation) {
		situationRepository.save( situation );
		return situationRepository.save( situation );
	}

	public void remove(UUID uuid) {
		situationRepository.deleteById( uuid );
	}

	public Situation update(UUID uuid, Situation situation) {
		situation.setUuid( uuid );
		return situationRepository.save( situation );
	}

	public List<SituationDto> findAll() {
		List<Situation> situations = situationRepository.findAll();
		return situations.stream().map(m -> map(m, SituationDto.class)).collect( Collectors.toList());
	}

	@Override
	public ModelMapper mapper() {
		return this.mapper;
	}
}
