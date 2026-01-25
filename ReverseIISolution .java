class ReverseIISolution {
    public String reverseStr(String s, int k) {
       char[] ch=s.toCharArray();

       
       for(int i=0;i<ch.length;i+=2*k){ 
        int start=i;
        int end=Math.min(i+k-1,ch.length-1);//k+i kel ast pn ,indexoutofbound mhn 
  while(start<=end){
        char temp=ch[end];
        ch[end]=ch[start];
        ch[start]=temp;
           start++;end--;
        }
        
    }
        String reversed = new String(ch);
        return reversed;
    }
}
