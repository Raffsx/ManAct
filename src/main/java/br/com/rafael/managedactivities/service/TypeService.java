package br.com.rafael.managedactivities.service;

import br.com.rafael.managedactivities.Dto.TypeDto;
import br.com.rafael.managedactivities.entity.Type;
import br.com.rafael.managedactivities.repository.TypeRepository;
import br.com.rafael.managedactivities.mapper.Mappable;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TypeService implements Mappable{

	private final TypeRepository typeRepository;
	private final ModelMapper mapper;

	@Autowired
	public TypeService(TypeRepository typeRepository, ModelMapper mapper) {
		this.typeRepository = typeRepository;
		this.mapper = mapper;
	}


	public Type create(Type type) {
		typeRepository.save( type );
		return typeRepository.save( type );
	}

	public void remove(UUID uuid) {
		typeRepository.deleteById( uuid );
	}

	public Type update(UUID uuid, Type type) {
		type.setUuid( uuid );
		return typeRepository.save( type );
	}

	public List<TypeDto> findAll() {
		List<Type> types = typeRepository.findAll();
		return types.stream().map(m -> map(m, TypeDto.class)).collect( Collectors.toList());
	}

	@Override
	public ModelMapper mapper() {
		return this.mapper;
	}
}
