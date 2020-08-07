package br.com.rafael.managedactivities.controller;

import br.com.rafael.managedactivities.Dto.SituationDto;
import br.com.rafael.managedactivities.entity.Situation;
import br.com.rafael.managedactivities.service.SituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/situation")
public class SituationController {

	@Autowired
	private SituationService situationService;

	@PostMapping
	public Situation create(final @RequestBody Situation situation) {
		situationService.create( situation );
		return situation;
	}

	@DeleteMapping("/{uuid}")
	@ResponseBody
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(final @PathVariable("uuid") UUID uuid) {
		situationService.remove( uuid );
	}

	@PutMapping("/{uuid}")
	public Situation update(final @PathVariable("uuid") UUID uuid, final @RequestBody Situation situation) {
		return situationService.update( uuid, situation );
	}

	@GetMapping
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<SituationDto> findAll() {
		return situationService.findAll();
	}
}
