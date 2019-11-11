import org.junit.Test;
import static org.junit.Assert.*;

public class Test {

	@Test
    public void teststatment(){

    	Movie movie1 = new Movie("Lord of the rings: the fellowship of the ring", 0);
    	Movie movie2 = new Movie("Finding Nemo", 2);
    	Movie movie3 = new Movie("Bacurau", 1);

    	Rental rent1 = new Rental(movie1,1);
    	Retnal rent2 = new Rental(movie2,4);
    	Rental rent3 = new Rental(movie3,5);

    	Costumer client = new Costumer("Jao");

    	client.addRental(rent1);
    	assertEquals(client1.statement(), "Rental Record for Jao\n\tLord of the rings: the fellowship of the ring\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points");
    	client.addRental(rent2);
    	assertEquals(client1.statement(), "Rental Record for Jao\n\tLord of the rings: the fellowship of the ring\t2.0\n\tFinding Nemo\t3.0\nAmount owed is 5.0\nYou earned 2 frequent renter points");
    	client.addRental(rent3);
    	assertEquals(client1.statement(), "Rental Record for Jao\n\tLord of the rings: the fellowship of the ring\t2.0\n\tFinding Nemo\t3.0\n\tBacurau\t15.0\nAmount owed is 20.0\nYou earned 4 frequent renter points");

    }

}