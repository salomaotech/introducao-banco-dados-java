package br.com.ebook;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Main {

    public static void main(String[] args) {

        EntityManager entityManager = ConectorJpa.getEntityManager();
        Query query = entityManager.createQuery("select obj from Cliente obj");
        List<Cliente> clienteList = query.getResultList();

        for (Cliente cliente : clienteList) {

            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Nascimento: " + cliente.getDataNascimento());

        }

        entityManager.close();
        ConectorJpa.fechar();

    }

}
