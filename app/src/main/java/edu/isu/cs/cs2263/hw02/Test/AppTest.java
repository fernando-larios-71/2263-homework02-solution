package edu.isu.cs.cs2263.hw02.Test;
//Imports
import edu.isu.cs.cs2263.hw02.App;
import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javafx.stage.Stage;
import org.testfx.framework.junit5.ApplicationTest;
import java.util.Vector;
import static org.junit.jupiter.api.Assertions.*;

class AppTest extends ApplicationTest{
    private App app;

    @Before
    @Override
    public void start(Stage stage) throws Exception{
        app = new App();
        app.start(stage);
        stage.setScene(app.getScene());
        stage.show();
    }

    @Test
    public void courseAddedRight(){

    }
    @Test
    public void courseViewSuccess(){

    }

    @Test
    public void courseViewError(){

    }

    @Test
    public void exitTest(){

    }

}