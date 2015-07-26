
public class FizzBuzz{
    int n;
    public FizzBuzz(){
        n=15;
    }
    public FizzBuzz(int temp ){
        n = temp;
    }

    public void play(){
        for(int i =1 ;i <= n;i ++)
        {
            if ( i % 3 ==0 || i % 5 ==0 )
            {
                if (  i % 3 ==0 )
                {
                    System.out.print("Fizz");
                }
                if ( i % 5 ==0 )
                {
                    System.out.print("Buzz");
                }
                System.out.print("\n");
            }
            else
            {
                System.out.println( i );
            }
        }
    }



}
