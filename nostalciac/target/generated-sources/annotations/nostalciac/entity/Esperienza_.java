package nostalciac.entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nostalciac.entity.Anagrafica;
import nostalciac.entity.Tag;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-05T14:39:29")
@StaticMetamodel(Esperienza.class)
public class Esperienza_ { 

    public static volatile SingularAttribute<Esperienza, LocalDate> inizio;
    public static volatile SingularAttribute<Esperienza, String> note;
    public static volatile SingularAttribute<Esperienza, String> stato;
    public static volatile SingularAttribute<Esperienza, LocalDate> fine;
    public static volatile SingularAttribute<Esperienza, String> luogo;
    public static volatile SingularAttribute<Esperienza, String> nome;
    public static volatile SingularAttribute<Esperienza, Integer> id;
    public static volatile SingularAttribute<Esperienza, Anagrafica> anagrafica;
    public static volatile SetAttribute<Esperienza, Tag> tags;

}