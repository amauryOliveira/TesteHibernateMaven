package testes;

//TestaInsereProduto.java
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Produto;

public class TestaInsereProduto {

public static void main(String[] args)
{
EntityManagerFactory factory =
 Persistence.createEntityManagerFactory("lojavirtualDB");
EntityManager em = factory.createEntityManager();

Produto p = new Produto();
p.setNome("bermuda");
p.setPreco(14.90);

em.getTransaction().begin();

em.persist(p);

em.getTransaction().commit();
}
}
