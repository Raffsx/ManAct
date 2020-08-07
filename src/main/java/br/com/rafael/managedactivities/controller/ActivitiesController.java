package br.com.rafael.managedactivities.controller;

import br.com.rafael.managedactivities.Dto.ActivitiesDto;
import br.com.rafael.managedactivities.entity.Activities;
import br.com.rafael.managedactivities.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/activities")
public class ActivitiesController {

	@Autowired
	private ActivitiesService activitiesService;

	@PostMapping
	public Activities create(final @RequestBody Activities activities) {
		activitiesService.create( activities );
		return activities;
	}

	@DeleteMapping("/{uuid}")
	public void remove(final @PathVariable("uuid") UUID uuid) {
		activitiesService.remove( uuid );
	}

	@PutMapping("/{uuid}")
	public Activities update(final @PathVariable("uuid") UUID uuid, final @RequestBody Activities activities) {
		return activitiesService.update( uuid, activities );
	}

	@GetMapping
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<ActivitiesDto> findAll() {
		return activitiesService.findAll();
	}
}
