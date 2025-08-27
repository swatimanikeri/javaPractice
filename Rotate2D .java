public class Rotate2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        //transpose(rows become columns)
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=0;
                   temp= arr[i][j];
                    arr[i][j] =arr[j][i];
                    arr[j][i]= temp;
            }
        }
        for(int i=0;i<arr.length;i++){//0,1,2
            int n= arr[i].length;
            for(int j=0;j<n/2;j++){
                int temp=0;
                temp= arr[i][j];
                arr[i][j]=arr[i][n-1-j];//2=length-i-1
                arr[i][n-1-j]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){//0,1,2
            int n= arr[i].length;
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] );
            }
            System.out.println();
        }


    }
}
