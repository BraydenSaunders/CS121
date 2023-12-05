package staticActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @BeforeEach

    public void setUp(){
        Person x = new Person("Johnny",15, 7.3);
        Person y = new Person("Jinny", 23, 5.5);
    }

    @Test

    void testInstanceCount(){
        assertEquals(2,Person.getInstanceCount());
    }
}