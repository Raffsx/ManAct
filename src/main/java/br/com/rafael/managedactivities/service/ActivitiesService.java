package br.com.rafael.managedactivities.service;

import br.com.rafael.managedactivities.Dto.ActivitiesDto;
import br.com.rafael.managedactivities.entity.Activities;
import br.com.rafael.managedactivities.mapper.Mappable;
import br.com.rafael.managedactivities.repository.ActivitiesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ActivitiesService implements Mappable {


	private final ActivitiesRepository activitiesRepository;
	private final ModelMapper mapper;

	@Autowired
	public ActivitiesService(ActivitiesRepository activitiesRepository, ModelMapper mapper) {
		this.activitiesRepository = activitiesRepository;
		this.mapper = mapper;
	}

	public Activities create(Activities activities) {
		activitiesRepository.save( activities );
		return activitiesRepository.save( activities );
	}

	public void remove(UUID uuid) {
		activitiesRepository.deleteById( uuid );
	}

	public Activities update(UUID uuid, Activities activities) {
		activities.setUuid( uuid );
		return activitiesRepository.save( activities );
	}

	public List<ActivitiesDto> findAll() {
		List<Activities> activities = activitiesRepository.findAll();
		return activities.stream().map(m -> map(m, ActivitiesDto.class)).collect( Collectors.toList());
	}

	@Override
	public ModelMapper mapper() {
		return this.mapper;
	}
}
