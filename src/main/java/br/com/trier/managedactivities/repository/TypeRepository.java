package br.com.trier.managedactivities.repository;

import br.com.trier.managedactivities.entity.Type;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TypeRepository extends JpaRepository<Type, UUID> {
}
