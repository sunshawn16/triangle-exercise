
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

}
