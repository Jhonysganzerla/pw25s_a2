package sganzerla.jhony.SpringCrudSampleAula2.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "livro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "{id}")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "editora_id", referencedColumnName = "id")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade;

    @Column(name = "isbn", nullable = false)
    private Long isbn;

    @Column(name = "data_fabricacao", nullable = false)
    private LocalDate dataFabricacao;
}
