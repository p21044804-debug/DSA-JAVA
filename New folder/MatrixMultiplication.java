import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] c=new int[3][3];
        System.out.println("Enter value for 1st Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter value for 2nd Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Multiplication of both Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
               
            }
            System.out.println();
        }
    }
}
