package onetooneunie8.cont;

import onetooneunie8.dao.AadharCardDao;
import onetooneunie8.dao.PersonDao;
import onetooneunie8.dto.AadharCard;
import onetooneunie8.dto.Person;

public class PersonAdharCont {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(1);
//	person.setName("murali");
//	person.setAddress("Mumbai");
//	
//	PersonDao dao=new PersonDao();
//	dao.savePerson(person);
	
	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(101);
//	aadharCard.setName("Muralidharan");
//	aadharCard.setAge(18);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(1, aadharCard);
	
	
	Person person=new Person();
	
	person.setName("muralidharan");
	person.setAddress("Mumbai");
	
	PersonDao dao=new PersonDao();
	
	dao.updatePerson(1, person);
	
	AadharCard aadharCard=new AadharCard();
	
	aadharCard.setName("Murali");
	aadharCard.setAge(18);
	
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.updateAadharCard(101, aadharCard);
	
	
	
	
	
}
}
