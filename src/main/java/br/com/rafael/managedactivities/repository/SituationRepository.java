package br.com.rafael.managedactivities.repository;

import br.com.rafael.managedactivities.entity.Situation;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SituationRepository extends JpaRepository<Situation, UUID> {

	List<Situation> findAll(Specification<Situation> spec);
}
