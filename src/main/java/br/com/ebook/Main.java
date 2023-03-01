package br.com.ebook;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Salomão Silva");
        cliente.setDataNascimento(LocalDate.of(1989, 9, 15));
        cliente.setCpf("000.000.000-00");

        EntityManager entityManager = ConectorJpa.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(cliente);
        entityTransaction.commit();

        entityManager.close();
        ConectorJpa.fechar();

    }

}
