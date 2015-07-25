
public class Pattern {
    String pattern = "*";
    public Pattern(){}
    public Pattern(String p){
        pattern = p;
    }

    public void patternGenerator(int n){
        for (int j = n; j > 0; j --)
        {
            System.out.print(pattern + " ");
        }

    }

    public void patternGeneratorVertical(int n){
        for (int j = n; j > 0; j --)
        {
            System.out.println(pattern);
        }
    }

    public void triangleGenerator(int n){
        for (int i = 1 ; i <= n ; i ++)
        {
            for (int j = 0 ; j < i ;j ++)
            {
                System.out.print(pattern + " ");
            }
            System.out.print("/n");
        }
    }

    public void diamondGenerator(int n){
        for (int i = n ,k = 1; i > 0  ; i --)
        {
            int T = i -1;
            int J= 2*k-1;
            for (int t = 0;t < T ;t ++)
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= J ; j ++)
            {
                System.out.print("*");
            }
            System.out.print("/n");
            k ++;
        }
    }

}
