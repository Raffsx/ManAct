package br.com.rafael.managedactivities.controller;

import br.com.rafael.managedactivities.Dto.TypeDto;
import br.com.rafael.managedactivities.entity.Type;
import br.com.rafael.managedactivities.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeService typeService;

	@PostMapping
	public Type create(final @RequestBody Type type) {
		typeService.create( type );
		return type;
	}

	@DeleteMapping("/{uuid}")
	public void remove(final @PathVariable("uuid") UUID uuid) {
		typeService.remove( uuid );
	}

	@PutMapping("/{uuid}")
	public Type update(final @PathVariable("uuid") UUID uuid, final @RequestBody Type type) {
		return typeService.update( uuid, type );
	}

	@GetMapping
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<TypeDto> findAll() {
		return typeService.findAll();
	}
}
