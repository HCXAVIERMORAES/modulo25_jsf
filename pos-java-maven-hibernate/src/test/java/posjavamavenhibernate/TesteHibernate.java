package posjavamavenhibernate;

import org.junit.Test;

public class TesteHibernate {

	//para testar se esta lendo o arquivo
	@Test
	public void testeHibernateUtil() {
		
		HibernateUtil.getEntityManager();	
		
	}
}
