package sganzerla.jhony.SpringCrudSampleAula2.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cidade")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "{id}")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nome;
}
