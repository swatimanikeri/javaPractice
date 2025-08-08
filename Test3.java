import java.util.Random;
public class Test3{

public static void main(String args[]){ 
String s="sw@21ti14";
Random random=new Random();
int num=random.nextInt(10);
StringBuffer sb1=new StringBuffer(); 
StringBuffer sb2=new StringBuffer(); 
StringBuffer sb3=new StringBuffer(); 
for (Character ch:s.toCharArray()){
     if (Character.isDigit(ch)){
        sb2.append(ch);
}

else if (Character.isLetter (ch)){
     sb1.append(ch);

}else{
sb3.append(ch);
}
}
if (num<5) {
System.out.println(s);
System.out.println();
}

else if(num>5 && num<7){
System.out.println(sb1.append(sb2).append(sb3));
System.out.println();}

else if (num>7 && num<9) {
System.out.println(sb2.append(sb3).append(sb1));
System.out.println();
}

}

}
