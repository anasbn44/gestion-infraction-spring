package ma.enset.immatriculationservice.repositories;

import ma.enset.immatriculationservice.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface PropretaireRepository extends JpaRepository<Proprietaire, Long> {
}
