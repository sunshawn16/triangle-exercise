
public class FizzBuzz{
    int n;
    public FizzBuzz(){
        n=6;
    }
    public FizzBuzz(int temp ){
        n = temp;
    }

    public void play(){
        for(int i =1 ;i <= n;i ++)
        {
            if ( i%3 ==0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println( i );
            }
        }
    }



}
