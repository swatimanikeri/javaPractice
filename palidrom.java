// public class palidrom {
//     public static void main(String[] args) {
//         String s="abcbca";
//         boolean res=ispalindrom(s);
//         if(res)
//         {
//             System.out.println("It a palindrom");
//         }
//         else
//         System.out.println("not palidrom");

//     }
//    public static boolean ispalindrom(String s){
//         s=s.toLowerCase();
//         String rev="";
//         for (int i = s.length()-1; i >=0; i--) {
//             rev=rev+s.charAt(i);
           
//         }
//         return s.equals(rev);
            
//     }
// }
public class palidrom{
    public static void main(string[] args) {
        string s="abccba";
        System.out.println(ispalindrom(s));
    }
   
    static boolean ispalindrom(string s){
        if(s==null || s.length()==0){
            return true;
        }
        s=s.toLowerCase();
        for (int i = 0; i <s.length()/2; i++) {
        char start=s.charAt(i);
       char end=s.charAt(s.length()-1-i);
       if(start!=end){
        return false;
       }
        }
        return true;
       
    }
}