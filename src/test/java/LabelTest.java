import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class LabelTest {
    Label label;
    @Before
    public void setup(){
        label = new Label(1, "Hello");
    }
    @Test
    public void hasAnID(){

        assertEquals(label.id,1);
    }
    @Test
    public void hasAName(){

        assertEquals(label.name,"Hello");
    }

}
