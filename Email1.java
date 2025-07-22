import java.util.Arrays;

public class Email1 {
    public static void main(String[] args) {
        String[] ids={"tommy@gmail.com","swati@yahoo.com","abcd@gmail.com"};
        String regEx="[@ .]";
        int count=0;
        int ycount=0;
      
        String[] str=new String[20];

        for(int i=0;i<ids.length;i++){
           str= ids[i].split(regEx);
           int j=1;
           if(str[j].equals("gmail")){
            count++;
           }
        
           else if(str[j].equals("yahoo")){
           ycount++;
           }
        }
           System.out.println("Gmail "+count);
           System.out.println("Yahoo "+ycount);

}}
   
        
    
