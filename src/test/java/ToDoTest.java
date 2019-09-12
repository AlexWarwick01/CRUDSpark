import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ToDoTest {
    ToDo todo;

    @Before
    public void setup(){
        todo = new ToDo();
    }

    @Test
    public void create(){
        todo = new ToDo();
    }

    @Test
    public void delete(){
        todo = null;
    }
    //AFTER DATABASE
    @Test
    public void attachLabel(){

    }
}
