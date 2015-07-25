import org.junit.Test;

public class TriangleTest {
    @Test
    public void should_get_one_asterisk(){
        Pattern pattern= new Pattern("*");
        pattern.patternGenerator();
    }
}
