public class Maximum {
    public static void main(string[] args) {
        int[] marks={24,67,45,38,29};
        int max=findmax(marks);
        System.out.println(max);

    }
    public static int findmax(int[] n){
        int max=n[0];
        for(int n1:n ){
            if(n1>max){
                max=n1;
            }
        }
        return max;
    }
}
