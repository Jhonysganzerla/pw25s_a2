package sganzerla.jhony.SpringCrudSampleAula2.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "editora")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "{id}")
public class Editora implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nome;
}
