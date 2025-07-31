package pe.edu.vallegrande.ms_water_distribution.infrastructure.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.edu.vallegrande.ms_water_distribution.domain.models.Organization;

public interface OrganizationRepository extends ReactiveMongoRepository<Organization, String> {
}