package br.com.financa.teste;

import javax.persistence.EntityManager;
import br.com.financa.model.Conta;
import br.com.financa.util.JPAUtil;


/*
 * 
 * Antes de executar os teste executar classe PopulaConta
 * 
 * */


public class EncontraContaTest {

  public static void main(String[] args) { 
    EntityManager entityManager = JPAUtil.getInstanceEntityManager();

    
    /*
     * Qualquer alteração do objeto conta dentro da transction, atualiza automaticamente o banco 
     * isso ocorre porque o metodo find retorna um objeto sincronizado com o banco
     * */
    entityManager.getTransaction().begin();

    Conta conta = entityManager.find(Conta.class, 1);

    entityManager.getTransaction().commit();

    conta.setTitular("Pedro Ferreira");
    
    
    System.out.println(conta.getTitular());
  }
}
