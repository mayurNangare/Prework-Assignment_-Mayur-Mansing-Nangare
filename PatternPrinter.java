import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }

    public static void patternPrinter(int n){
        int i,j,k,size;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                size = n-i;
                for(k=0;k<size;k++)
                {

                    System.out.print(n-j);
                }
            }
            System.out.println();
        }
    }
}
