import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class LabelTest {
    Label label;
    @Before
    public void setup(){
        label = new Label();
    }

    @Test
    public void delete(){
        label = null;
    }

}
