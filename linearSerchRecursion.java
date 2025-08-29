package DAY3;

import java.util.ArrayList;

public class linearSerchRecursion {
    public static void main(String[] args) {
  int arr[]={1,2,3,4,5};
  int target=5 ;
  int index=0;
        System.out.println(linear(arr,target,index));
        linearAll(arr,target,index);
        System.out.println(list);
    }
    public static int linear(int arr[],int target,int index){
  if(index==arr.length){
   return -1;
 }
  if(arr[index]==target){
      return index;
  }else{
      return linear(arr,target,index+1);
  }

    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void linearAll(int arr[],int target,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
         linearAll(arr,target,index+1);
}

}

// if(index==arr.length){
//   return false;
// }
//
//  }
//  return arr[index]==target ||linear(arr,target,index+1);
//
