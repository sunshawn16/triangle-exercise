import org.junit.Test;

public class FizzBuzzTest{
    @Test
    public void should_get_number_100_when_play(){
        FizzBuzz game2 =  new FizzBuzz();
        game2.play();
    }
    @Test
    public void should_get_Fizz_when_3_divisible(){
        FizzBuzz game =  new FizzBuzz();
        game.play();
    }



}