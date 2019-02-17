import People.Customer;
import People.Person;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    Person person;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        person = new Customer(70, "Megan");
        customer = new Customer(80, "Declan");
    }

    @Test
    public void canHaveMoney() {
        assertEquals(70, person.getMoney());
    }

    @Test
    public void customeCanHaveMoney() {
        assertEquals(80, customer.getMoney());
    }
}
