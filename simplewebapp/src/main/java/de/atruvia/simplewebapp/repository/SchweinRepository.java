package de.atruvia.simplewebapp.repository;

import de.atruvia.simplewebapp.repository.entity.SchweinEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SchweinRepository extends CrudRepository<SchweinEntity, UUID> {
}
