import java.util.Scanner;
public class HollowNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        //Upper half of hollow diamond
        for(int i=1;i<=n;i++){              
            for(int j=1;j<=n-i;j++){        // Print spaces before the stars
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){   
                if(k==1 || k==2*i-1){
                    System.out.print(k);
                } 
                else{
                    System.out.print(" ");
                } // Print stars and spaces for the upper half of the hollow diamond
            }
            System.out.println();
        }

        //Lower half of hollow diamond
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){        // Print spaces before the stars
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){    
                if(k==1 || k==2*i-1){
                    System.out.print(k);
                }  
                else{
                    System.out.print(" ");
                }// Print stars and spaces for the lower half of the hollow diamond
            }
            System.out.println();
        }
        sc.close();
    }
}