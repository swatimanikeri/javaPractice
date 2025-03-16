public class Pattern {
    public static void main(String[] args) {
        pattern1(4); 
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(4);
        System.out.println();
        pattern6(4);
        
        System.out.println();
        pattern7(4);
        System.out.println();
        pattern8(4);
        // Correct method call
    }




    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }



    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }



    static void pattern3(int n) {
       
        for (int row = 0; row <=2*n; row++) {
            int cols;
            cols=row>n ? 2*n-row:row;
            for (int  col = 1; col <=cols; col++) {
                System.out.print("* ");
            }
             System.out.print("* ");
                System.out.println(); // Move to the next line
        }
    }



    static void pattern4(int n) {
        
        for (int row = 1; row <=n; row++) {

            for ( int col = 1; col <=row; col++) {
                System.out.print("* ");
           }
           System.out.println(); // Move to the next line
            
        }
        for (int row = n-1; row >=1; row--) {

            for ( int col = row; col >=1; col--) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
            
        }
    }



    static void pattern5(int n) {
       
        for (int row = 0; row <=2*n; row++) {
            int cols;
            cols=row>n ? 2*n-row:row;
            int spaces=cols;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
        
            for (int  col = 1; col <=cols; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    static void pattern6(int n) {
       
        for (int row = 0; row <=2*n; row++) {
            int cols;
            cols=row>n ? 2*n-row:row;
            int spaces=n-cols;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
        
            for (int  col = 1; col <=cols; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
    
    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int sp=n-row;
            for(int s=1;s<=sp;s++){
                System.out.print("  "); 
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

   static void pattern8(int n){
    for (int row = 0; row < 2*n; row++) {
        int cols=row>n ?2*n-row:row;
        int spc=n-row;
        for (int s = 1; s <=spc; s++) {
            System.err.print(" ");
        }
        for (int col = 1; col <= cols; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
   }
}
