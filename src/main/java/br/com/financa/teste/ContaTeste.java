package br.com.financa.teste;

import javax.persistence.EntityManager;
import br.com.financa.model.Conta;
import br.com.financa.util.JPAUtil;

public class ContaTeste {

  public static void main(String[] args) {

    Conta conta = new Conta();
    conta.setTitular("Joao Ferreira");
    conta.setBanco("HSBC");
    conta.setNumero("123345");
    conta.setAgencia("321");

    EntityManager manager = JPAUtil.getInstanceEntityManager();

    /**
     * Para se realizar uma operação utilizando o hibernate é necessario abrir uma transaction e finalizar com o commit 
     */
    manager.getTransaction().begin();
    manager.persist(conta);
    manager.getTransaction().commit();
    
    manager.close();
  }
}
