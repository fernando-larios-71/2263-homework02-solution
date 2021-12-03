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
        String name = 'OO Programming';
        classToTest.setName(name);
        assertNotNull(classToTest.getName());
    }

    @Test void CourseCode(){
        Course classToTest = new Course();
        String code = '2263';
        classToTest.setCode(code);
        assertNotNull(classToTest.getCode());
    }


}