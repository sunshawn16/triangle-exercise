import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    @Before
    public void before(){
        System.out.print("before");
    }

    @Test
    public void should_get_one_asterisk(){
        Pattern pattern= new Pattern("*");
        pattern.patternGenerator(1);
    }

    @Test
    public void should_get_eight_asterisk_in_line_when_enter_eight(){
        Pattern pattern = new Pattern();
        pattern.patternGenerator(8);
    }

    @Test
    public void should_get_three_asterisk_vertical_when_enter_three(){
        Pattern pattern = new Pattern();
        pattern.patternGeneratorVertical(3);
    }

    @Test
    public void should_get_triangle_when_enter_three(){
        Pattern pattern = new Pattern();
        pattern.triangleGenerator(3);
    }

    @Test
    public void should_get_basicdimond_when_needbasicDiamond(){
        Pattern pattern = new Pattern();
        pattern.basicDiamondGenerator(3);
    }

    @Test
    public void should_get_centereddiamond_when_need_centerDiamond(){
        Pattern pattern = new Pattern();
        pattern.centerDiamondGenerator(3);
    }

}
