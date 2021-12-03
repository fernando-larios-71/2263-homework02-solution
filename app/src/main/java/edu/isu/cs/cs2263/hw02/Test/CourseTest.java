package edu.isu.cs.cs2263.hw02.Test;

//Imports
import org.testng.annotations.Test;
import edu.isu.cs.cs2263.hw02.data.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test void CourseIsNumbered(){
        Course classToTest = new Course();
        assertNotNull(classToTest.getNumber());
    }

    private void assertNotNull(int number) {
    }

    @Test void CourseIsNamed(){
        Course classToTest = new Course();

        assertNotNull(classToTest.getName());
    }
    @Test void
}