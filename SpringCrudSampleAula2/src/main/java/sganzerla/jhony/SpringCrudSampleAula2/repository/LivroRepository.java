package sganzerla.jhony.SpringCrudSampleAula2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sganzerla.jhony.SpringCrudSampleAula2.model.Livro;

import java.time.LocalDate;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long>{

    List<Livro> findByAutorNomeContainsOrderByDataFabricacao(String autor);

    List<Livro> findByDataFabricacao( LocalDate dataFabricacao);

    List<Livro> findByGeneroNomeContainsOrderByDataFabricacao(String descricao);

    List<Livro> findByIsbnOrTituloContains(Long isbn, String titulo);

    List<Livro> findByValorGreaterThanEqual(Double valor);

    List<Livro> findByValorBetweenOrderByDataFabricacao(Double valor, Double valor2);

/**Criar um novo projeto realizar o mapeamento ORM das classes e criar os repositórios para:

 Cidade {id, nome}
 Autor {id, nome}
 Editora {id, nome}
 Genero {id, descricao}
 Livro {id, titulo, EDITORA, GENERO, AUTOR, ano, isbn, CIDADE, valor}
 Consultas:

 Retornar os Livros pesquisando por parte do nome do autor e ordenando por ano. --

 Retornar os livros filtrando por ano. --

 Retornar os livros filtrando pela descrição do gênero e ordenando por ano. --

 Retornar os livros filtrando a mesma string pelo ISBN ou Título e ordenar por ano

 Retornar os livros com valores maiores que...

 Retornar os livros com valores entre A* e B* ordenados por ano*/
}
