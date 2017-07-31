package br.com.financa.dao;

import javax.persistence.EntityManager;
import br.com.financa.model.Conta;
import br.com.financa.util.JPAUtil;

public class ContaDAO {
  
  private EntityManager entityManager;
  
  public ContaDAO() {
    this.entityManager = JPAUtil.getInstanceEntityManager();
  }

  public void remove(int id){
    entityManager.getTransaction().begin();
    //Para o hibernate realizar a remoção de um objeto ele tem que estar no estado de mergerd
    Conta conta  = entityManager.find(Conta.class,id);
    entityManager.remove(conta);
    entityManager.getTransaction().commit();
    entityManager.close();
  }

  public void update (Conta conta){
    entityManager.getTransaction().begin();
    entityManager.merge(conta);
    entityManager.getTransaction().commit();
    entityManager.close();
  }
  
  public void save(Conta conta){
    //Abre uma conexao transaction
    entityManager.getTransaction().begin();
    
    //Persiste objeto no banco
    entityManager.persist(conta);
    entityManager.getTransaction().commit();
    
    //Fecha conexao transaction
    entityManager.close();
  }

}
