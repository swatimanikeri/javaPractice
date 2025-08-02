import java.util.HashSet;
import java.util.Random;

class lotterySystem2{
public static <E> void main(String[] args) {
    int arr[] =new int[11];
    Random random=new Random();
    HashSet<Integer> set=new HashSet<Integer>();
    while(set.size()<12){
        set.add(random.nextInt(9000)+1000);
    }
    // for (Integer s1 : set) {
    //     System.out.println(s1);
    // }
    // Stream<Integer> s=set.stream();
    int twoDigit=random.nextInt(90)+10;
  Integer[] arr2=set.stream().map(x->twoDigit*x).sorted().toArray(Integer[]::new );

  // for(Integer i:arr2){
  //   System.out.println(i);
  // }
 int firstWinner=0;
  int secondWinner=0;
    int ThirdWinner=0;
  for(int i=0;i<arr2.length;i++){
       int start=0;
       int end=arr2.length;
        firstWinner=start+(end-start)/2;
       secondWinner=firstWinner-1;
      ThirdWinner=firstWinner+1;
  }
  System.out.println("First winner lottery no "+arr2[firstWinner]);
   System.out.println("Second winner lottery no "+arr2[secondWinner]);
    System.out.println("third winner lottery no "+arr2[ThirdWinner]);
}}
//2nd time not
