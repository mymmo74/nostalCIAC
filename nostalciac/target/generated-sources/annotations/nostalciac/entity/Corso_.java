package nostalciac.entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nostalciac.entity.Sede;
import nostalciac.entity.Tag;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-29T13:45:53")
@StaticMetamodel(Corso.class)
public class Corso_ { 

    public static volatile SingularAttribute<Corso, LocalDate> inizio;
    public static volatile SingularAttribute<Corso, String> note;
    public static volatile SingularAttribute<Corso, LocalDate> fine;
    public static volatile SingularAttribute<Corso, String> edizione;
    public static volatile SingularAttribute<Corso, Sede> sede;
    public static volatile SingularAttribute<Corso, String> nome;
    public static volatile SingularAttribute<Corso, Integer> id;
    public static volatile SingularAttribute<Corso, Integer> idSede;
    public static volatile SetAttribute<Corso, Tag> tags;

}