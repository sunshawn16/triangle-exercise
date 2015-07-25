
public class Pattern {
    String pattern = "*";
    public Pattern(){};
    public Pattern(String p){
        pattern = p;
    }

    public void patternGenerator(int n){
        for (int j = n; j > 0; j --)
        {
            System.out.print(pattern+" ");
        }

    }
}
