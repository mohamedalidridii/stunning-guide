package org.example.projet.repositories;

import org.example.projet.entities.FamilleActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamilleActe, Long> {
}
