package hu.elte.alkfejl.carhire.model;

import lombok.Data;
import javax.persistence.*;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //GenerationType.SEQUENCE helyett
    private long id;

    @Version
    private long version;
}