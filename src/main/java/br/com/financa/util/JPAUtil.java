package br.com.financa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

  public static EntityManager getInstanceEntityManager() {

    EntityManagerFactory entityManagerFactory = Persistence
      .createEntityManagerFactory("financas");
    return entityManagerFactory.createEntityManager();
  }
  
}
