import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ToDoTest {
    ToDo todo;

    @Before
    public void setup(){
        todo = new ToDo(1,"Hello World", 1);
    }
    @Test
   public void canHaveAnID(){
        assertEquals(todo.getid(),1);

    }
    @Test
    public void canHaveContent(){
        assertEquals(todo.getContent(),"Hello World");

    }
    @Test
    public void canHaveALabelID(){
        assertEquals(todo.getLabelid(),1);

    }
}
