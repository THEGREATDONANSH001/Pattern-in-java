import java.util.*;
public class Pattern6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++){
            for(int j=1;j<=i*2;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}