import java.util.ArrayList;
public class ToDoList {
    private ArrayList<ToDo> todos;

    public ToDoList(String name){
        todos = new ArrayList<ToDo>();
    }


    public void add(ToDo todo){
        todos.add(todo);

    }
    public void delete(ToDo todo){
        todos.remove(todo);
    }






}
