package sganzerla.jhony.SpringCrudSampleAula2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sganzerla.jhony.SpringCrudSampleAula2.model.Livro;
import sganzerla.jhony.SpringCrudSampleAula2.repository.LivroRepository;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringCrudSampleAula2Application implements CommandLineRunner {

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudSampleAula2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Livro> lstLivro  = livroRepository.findByAutorNomeContainsOrderByDataFabricacao("jhony");

		printaLista(lstLivro);

		lstLivro  = livroRepository.findByDataFabricacao(LocalDate.of(1998,5,16));

		printaLista(lstLivro);

		lstLivro  =  livroRepository.findByGeneroNomeContainsOrderByDataFabricacao("genero");
		printaLista(lstLivro);

		lstLivro  =  livroRepository.findByIsbnOrTituloContains(121L, "livro");
		printaLista(lstLivro);

		lstLivro  =  livroRepository.findByValorGreaterThanEqual(1D);
		printaLista(lstLivro);

		lstLivro  = livroRepository.findByValorBetweenOrderByDataFabricacao(3D,5D);
		printaLista(lstLivro);


	}

	private void printaLista(List<Livro> lstLivro) {
		System.out.println("\n-----------------------LISTANDO-----------------------------------\n");
		lstLivro.forEach(System.out::println);
		System.out.println("\n----------------------------------------------------------\n");
	}

//	private void salvarCategoria(Categoria categoria) {
//		System.out.println("\n-----------------------Salvar-----------------------------------\n");
//		this.livroRepository.save(categoria);
//		System.out.println("\n----------------------------------------------------------\n");
//	}
//
//	private void removerCategoria(Categoria categoria) {
//		System.out.println("\n----------------------------------Deletando-----------------------------------\n");
//		this.livroRepository.delete(categoria);
//		System.out.println("\n-----------------------Categoria deletada com sucesso-----------------------------------\n");
//	}
//
//	private void listarCategoriaByDescricaoContains(String descricao) {
//		System.out.println("\n----------------------------------Listando by descricao-----------------------------------\n");
//		this.livroRepository.findByDescricaoContains(descricao);
//		System.out.println("\n---------------------------Categoria achada com sucesso-----------------------------------\n");
//	}
//
//
//	private void listarProdutos() {
//		System.out.println("\n-----------------------LISTANDO-----------------------------------\n");
//		this.livroRepository.findAll().forEach(System.out::println);
//		System.out.println("\n----------------------------------------------------------\n");
//	}
}