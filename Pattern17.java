import java.util.*;
class Pattern17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*for(int i=0;i<=(n-1)/2;i++){
            for(int j=(n-1)/2;j>=i;j--){
                System.out.print("* ");
            }
            for(int j=2*i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=i-2;j>=0;j--){
                System.out.print("  ");
            }
            for(int j=(n-1)/2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=(n-1)/2;i>=1;i--){
            for(int  j=(n-1)/2;j>=i;j--){
                System.out.print("* ");
            }
            for(int j=i-1;j>=0;j--){
                System.out.print("  ");
            }
            for(int j=i-2;j>=0;j--){
                System.out.print("  ");
            }
            for(int j=(n-1)/2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        for(int i=0;i<=(n-1)/2;i++){
            for(int j=0;j<=((n-1)/2)-i-1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i+1;j++){
            System.out.print("  ");
            }
            for(int j=0;j<=((n-1)/2)-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=(n-1)/2;i>=0;i--){
            for(int j=0;j<=((n-1)/2)-i-1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i+1;j++){
            System.out.print("  ");
            }
            for(int j=1;j<=((n-1)/2)-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}