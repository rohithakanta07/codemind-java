import java.util.*;
public class Perecentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double ans = (a-b)*100/a;
        System.out.format("%.2f",ans);
    }
}
