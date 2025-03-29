
enum Beer{
    KF(100),KO(70),RC(65),FO(90),KALYANI;
    int price;
    Beer(int price){
        this.price=price;
    }
    Beer(){
        this.price=124;
    }

    public int getPrice() 
    {
        return price;
    }
}
public class enumExample1 {
    public static void main(String[] args){
        Beer[] b=Beer.values();
        for(Beer b1:b){
            System.out.println(b1+".............."+b1.getPrice());
        }

    }
   
}
