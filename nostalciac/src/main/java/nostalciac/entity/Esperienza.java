/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "t_esperienze")
public class Esperienza implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_esperienza")
    private Integer id;
    
    @Column(name = "esperienza")
    private String nome;
            
    @Column(name = "note_esperienza")
    private String note;
            
    @Column(name = "luogo")
    private String luogo;
            
    @Column(name = "nazione")
    private String stato;
            
    @Column(name = "dato_inizia_esperienza")
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate inizio;
            
    @Column(name = "dato_fine_esperienza")
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate fine;
            
    @ManyToOne
    @JoinColumn(name = "id_anagrafica", referencedColumnName = "id_anagrafica")
    private Anagrafica anagrafica;
    
    @ManyToMany()
    // serve per spiegare come è fatta la nostra tabella "t_tags_corsi"
    @JoinTable(
            name = "t_tags_esperienze",
            joinColumns
            = @JoinColumn(name = "id_esperienza",
                    referencedColumnName = "id_esperienza"),
            inverseJoinColumns
            = @JoinColumn(name = "id_tag",
                    referencedColumnName = "id_tag")
    )
    private Set<Tag> tags = new TreeSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public LocalDate getInizio() {
        return inizio;
    }

    public void setInizio(LocalDate inizio) {
        this.inizio = inizio;
    }

    public LocalDate getFine() {
        return fine;
    }

    public void setFine(LocalDate fine) {
        this.fine = fine;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

        
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Esperienza other = (Esperienza) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Esperienza{" + "id=" + id + ", nome=" + nome + ", note=" + note + ", luogo=" + luogo + ", stato=" + stato + ", inizio=" + inizio + ", fine=" + fine + '}';
    }
    
    
            
    
}
