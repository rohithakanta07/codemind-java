import java.util.*;
public class Frames{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int s = (2*(l+b))*x;
        System.out.println(s);
    }
}