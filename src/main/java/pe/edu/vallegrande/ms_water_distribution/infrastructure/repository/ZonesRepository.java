package pe.edu.vallegrande.ms_water_distribution.infrastructure.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.edu.vallegrande.ms_water_distribution.domain.models.Zones;
import reactor.core.publisher.Flux;

public interface ZonesRepository extends ReactiveMongoRepository<Zones, String> {
    Flux<Zones> findAllByOrganizationId(String organizationId);
    Flux<Zones> findAllByStatus(String status);
}