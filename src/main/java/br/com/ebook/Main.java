package br.com.ebook;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {

    public static void main(String[] args) {

        EntityManager entityManager = ConectorJpa.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Cliente cliente = entityManager.find(Cliente.class, 1L);
        cliente.setNome("Jessica Dias");
        cliente.setCpf("000.000.000.12");

        entityTransaction.commit();
        entityManager.close();
        ConectorJpa.fechar();

    }

}
