import java.util.*;
public class ProfitPercentage{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextInt();
        double sp = sc.nextInt();
        double ans = ((sp-cp)/cp)*100;
        System.out.println(String.format("%.2f",ans));
    }
}