public class ReverseString {
    public static void main(string[] args) {
        string s="abcd";
        string r=" ";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            r=ch+r;

            
        }
System.out.println(r);
    }
    
}
