package onetooneunie8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunie8.dto.AadharCard;
import onetooneunie8.dto.Person;

public class AadharCardDao {

	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		
		if(dbPerson!=null) {
//			personn is present then i can issue the addharcard
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(aadharCard);
			
//			update that person details
			dbPerson.setAadharCard(aadharCard);
			
			entityTransaction.commit();
		}else {
//			person is a fake person 
			System.out.println("Sorry Id is not present");
		}
		
	}
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			that aadhaCard is present so i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry that id is not present");
		}
	}
	public void findAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			that aadhaCard is present so i can update the data
			System.out.println(dbAadharCard);
		}else {
			System.out.println("Sorry that id is not present");
		}
	}
	
	public void deleteAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			that aadhaCard is present so i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry that id is not present");
		}
	}
	
	
	
	
	
	
	
}
