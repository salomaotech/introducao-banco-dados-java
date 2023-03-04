package br.com.ebook;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        EntityManager entityManager = ConectorJpa.getEntityManager();
        Cliente cliente = entityManager.find(Cliente.class, 1L);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nascimento: " + cliente.getDataNascimento());

        entityManager.close();
        ConectorJpa.fechar();

    }

}
