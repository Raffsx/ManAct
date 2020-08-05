package br.com.trier.managedactivities.repository;

import br.com.trier.managedactivities.entity.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, UUID> {
}
