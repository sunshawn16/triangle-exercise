import org.junit.Test;

public class TriangleTest {
    @Test
    public void should_get_one_asterisk(){
        Pattern pattern= new Pattern("*");
        pattern.patternGenerator(1);
    }

    @Test
    public void should_get_eight_asterisk_in_line_when_enter_eight(){
        Pattern pattern= new Pattern();
        pattern.patternGenerator(8);
    }

}
