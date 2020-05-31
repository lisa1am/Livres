package fr.dauphine.miageif.msa.Biblio.Repository;

import fr.dauphine.miageif.msa.Biblio.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    Livre findByIsbn(String isbn);

    List<Livre> findAllByAuteur(String Auteur);

    void deleteByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    List<Livre> findAllByTitre(String titre);



}
