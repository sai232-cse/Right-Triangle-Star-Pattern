import java.util.Scanner;
public class RightTriangleStarPattern{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the number of rows to print");
        int n=snr.nextInt();
	System.out.println("The right traingle star pattern is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}