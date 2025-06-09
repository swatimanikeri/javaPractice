public class BubbleSortEx {
     public static void main(String[] args) {
        int arr[]={3,8,9,45,6,2,9,2};
           int result[]=bubble( arr);

           for (int num : result) {
            System.out.print(num + " ");
        }
     

    }



    public static  int[] bubble(int arr[]){

        for( int i=0;i<arr.length-1;i++){
       
          for(int j=0;j<arr.length-1-i;j++){
              if(arr[j]<arr[j+1]){
             
             
            

               int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;

              }

          }


         


        }
       return arr;
    }
   
}



   
