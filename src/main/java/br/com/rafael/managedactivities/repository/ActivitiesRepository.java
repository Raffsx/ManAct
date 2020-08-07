package br.com.rafael.managedactivities.repository;

import br.com.rafael.managedactivities.entity.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, UUID> {
}
