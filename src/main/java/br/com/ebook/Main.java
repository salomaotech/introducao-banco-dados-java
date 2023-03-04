package br.com.ebook;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    
    public static void main(String[] args) {
        
        EntityManager entityManager = ConectorJpa.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Cliente cliente = entityManager.find(Cliente.class, 2L);
        entityManager.remove(cliente);
        
        entityTransaction.commit();
        entityManager.close();
        ConectorJpa.fechar();
        
    }
    
}
