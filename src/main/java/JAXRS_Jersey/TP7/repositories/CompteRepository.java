package JAXRS_Jersey.TP7.repositories;

import JAXRS_Jersey.TP7.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}