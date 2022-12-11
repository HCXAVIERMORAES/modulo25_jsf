package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import posjavamavenhibernate.HibernateUtil;

public class DaoGeneric<E> {
	
	/*O <E> na classe principal é um padrao java insserido manualmente
	 * */
	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	//método de salvar, ou persistir,  de modo generico
	public void salvar(E entidade) {
		
		EntityTransaction transaction = entityManager.getTransaction(); //iniciar uma transação 
		transaction.begin();
		entityManager.persist(entidade); //persistir no hibernate
		transaction.commit(); //salvar  no banco		
	}
	
	//metodo que retorna a entidade com  id
	public E pesquisar(E entidade) {
		
		Object id = HibernateUtil.getpPrimaryKey(entidade);
		
		E e = (E) entityManager.find(entidade.getClass(), id);
		
		return e;		
	}
	
	//2ª metodo de pesquisa passando o id
	//metodo que retorna a entidade com  id
		public E pesquisar(Long id ,Class<E> entidade) {
			
			E e = (E) entityManager.find(entidade, id);
			
			return e;		
		}
	

}//fim daoGeneric
