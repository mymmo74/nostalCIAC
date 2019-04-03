/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "t_anagrafiche")
public class Anagrafica implements Serializable{
    @Id
    @Column(name = "id_anagrafica")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "cognome")
    private String cognome;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "usr")
    private String usr;
    
    @Column(name = "pwd")
    private String pwd;
    
    @Column(name = "mail")
    private String mail;
    
    @Column(name = "ruolo")
    private String ruolo;
    
    @Column(name = "citta")
    private String citta;
    
    @Column(name = "data_nascita")
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate nascita;
    
    @Column(name = "indirizzo")
    private String indirizzo;
    
    @Column(name = "tel")
    private String tel;
    
    @Column(name = "note")
    private String note;
    
    @Column(name = "filefoto")
    private String filefoto;

    public Anagrafica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    public void setNascita(LocalDate nascita) {
        this.nascita = nascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFilefoto() {
        return filefoto;
    }

    public void setFilefoto(String filefoto) {
        this.filefoto = filefoto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Anagrafica other = (Anagrafica) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Anagrafica{" + "id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", usr=" + usr + ", pwd=" + pwd + ", mail=" + mail + ", ruolo=" + ruolo + ", citta=" + citta + ", nascita=" + nascita + ", indirizzo=" + indirizzo + ", tel=" + tel + ", note=" + note + ", filefoto=" + filefoto + '}';
    }

    
}
