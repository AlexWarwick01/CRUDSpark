import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class ToDoListTest {

    ToDoList todolist;
    @Before
    public void create(){
        todolist = new ToDoList("");
    }

    @Test
    public void canAddToList(){
        ToDo todo = mock(ToDo.class);
        todolist.add(todo);
        assertThat(todolist.todos,contains(todo));
    }
}
