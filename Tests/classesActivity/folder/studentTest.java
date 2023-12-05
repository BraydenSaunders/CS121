package classesActivity.folder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class studentTest {
    student bsu = new student();
    @Test
    public void setGPA() {
        assertEquals(0.0, bsu.getGPA());
    }
    @Test
    void testConstructor(){
        student nyu = new student();
        assertNotNull(nyu);
    }
}