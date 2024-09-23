package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Witness", "witness@gmail.com");
		Pessoa p2 = new Pessoa(null, "Axelly", "axelly@gmail.com");
		Pessoa p3 = new Pessoa(null, "Sierwa", "sierwa@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Pessoa.class, 8));
		em.remove(em.find(Pessoa.class, 9));
		em.remove(em.find(Pessoa.class, 10));
		em.getTransaction().commit();
		
		System.out.println("Feito");
		
	}

}
