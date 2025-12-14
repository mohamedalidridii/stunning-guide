package org.example.projet.repositories;

import org.example.projet.entities.FamilleActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository extends JpaRepository<FamilleActe, Long> {
}
