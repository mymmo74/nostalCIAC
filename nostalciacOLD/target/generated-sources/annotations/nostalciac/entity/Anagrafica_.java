package nostalciac.entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nostalciac.entity.Corso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-08T15:26:59")
@StaticMetamodel(Anagrafica.class)
public class Anagrafica_ { 

    public static volatile SingularAttribute<Anagrafica, String> note;
    public static volatile SingularAttribute<Anagrafica, String> mail;
    public static volatile SingularAttribute<Anagrafica, String> cognome;
    public static volatile SingularAttribute<Anagrafica, LocalDate> nascita;
    public static volatile SingularAttribute<Anagrafica, String> indirizzo;
    public static volatile SingularAttribute<Anagrafica, String> nome;
    public static volatile SingularAttribute<Anagrafica, String> filefoto;
    public static volatile SingularAttribute<Anagrafica, String> ruolo;
    public static volatile SingularAttribute<Anagrafica, String> usr;
    public static volatile SingularAttribute<Anagrafica, String> tel;
    public static volatile SingularAttribute<Anagrafica, Integer> id;
    public static volatile SetAttribute<Anagrafica, Corso> corsi;
    public static volatile SingularAttribute<Anagrafica, String> pwd;
    public static volatile SingularAttribute<Anagrafica, String> citta;

}