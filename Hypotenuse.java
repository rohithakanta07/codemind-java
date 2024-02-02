import java.util.*;
public class Hypotenuse{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double ans=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.format("%.2f",ans);
    }
}