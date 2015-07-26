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
    @Test
    public void should_get_Buzz_when_5_divisible(){
        FizzBuzz game =  new FizzBuzz(100);
        game.play();
    }
    @Test
    public void should_return_null_when_enter_1_in_prime_factor_List() {
        FizzBuzz game = new FizzBuzz(1);
        game.primeGenerator();
    }
    @Test
    public void should_return_list_when_enter_30_in_prime_factor_List() {
        FizzBuzz game = new FizzBuzz(30);
        game.primeGenerator();
    }

}