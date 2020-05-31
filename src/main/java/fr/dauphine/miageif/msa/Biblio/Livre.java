package fr.dauphine.miageif.msa.Biblio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Livre {

    @Id
    private String isbn;

    @Column(name="auteur")
    private String auteur;

    @Column(name="titre")
    private String titre;

    @Column(name="editeur")
    private String editeur;

    @Column(name="edition")
    private Long edition;

    public Livre(){}

    public Livre(String isbn, String auteur, String titre, String editeur, Long edition){
        this.isbn=isbn;
        this.auteur=auteur;
        this.titre=titre;
        this.editeur=editeur;
        this.edition=edition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return isbn.equals(livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Long getEdition() {
        return edition;
    }

    public void setEdition(Long edition) {
        this.edition = edition;
    }
}
