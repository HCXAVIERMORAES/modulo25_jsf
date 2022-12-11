package posjavamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {

	//para testar se esta lendo o arquivo
	@Test
	public void testeHibernateUtil() {
		
		//HibernateUtil.getEntityManager();	teste de criação e update do banco
		
		//teste de inserção de dados
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>(); //instancia a classe
		UsuarioPessoa pessoa = new UsuarioPessoa(); //instancia a classe usuario
		  
		 //inser os dados da classe
		 pessoa.setNome("Julio");
		 pessoa.setSobrenome("Cesar");
		 pessoa.setEmail("pc@gmail.com");
		 pessoa.setIdade(33);
		 pessoa.setLogin("teste");
		 pessoa.setSenha("1234");
		 
		 daoGeneric.salvar(pessoa); //salva os dados		
	}
	
	//teste de id
	@Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>(); 
		UsuarioPessoa pessoa = new UsuarioPessoa(); 
		pessoa.setId(2L);
		
		pessoa = daoGeneric.pesquisar(pessoa);
		
		System.out.println(pessoa); //mostrar natel		
	}
	
	//teste de id passando o id
		@Test
		public void testeBuscar2() {
			DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>(); 
						
			UsuarioPessoa pessoa = daoGeneric.pesquisar(1L,UsuarioPessoa.class);
			
			System.out.println(pessoa); //mostrar natel		
		}
	
}
