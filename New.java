public class New {
    public static void main(String[] args) {
        String s="shreya";
        System.out.println(s.charAt(3));
        System.out.println(s.codePointAt(5));
        System.out.println(s.codePointBefore(5));
        System.out.println(s.compareTo("sg"));
        System.out.println(s.compareTo("sg"));
        String sw="shreya";
        String sc="maya";
        System.out.println(sw.equals(sc));
        System.out.println(sw==s);
        String s1=new String("me");
        String s2=new String("me");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }}
