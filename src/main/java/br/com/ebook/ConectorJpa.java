package br.com.ebook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectorJpa {

    private static final EntityManagerFactory factory;

    static {

        factory = Persistence.createEntityManagerFactory("Conexao");

    }

    public static EntityManager getEntityManager() {

        return factory.createEntityManager();

    }

    public static void fechar() {

        factory.close();

    }

}
