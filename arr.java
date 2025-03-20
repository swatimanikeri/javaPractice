
interface A{
    int x=333;
    void display();
    }
    interface C {
        abstract void m1();
        
    }
    class B implements A,C{
        public void display(){
            System.out.println("Implements interface A");
        }
        public void m1(){
            System.out.println("implements interface C");
        }
    }
    public class arr {
        public static void main(String[] args) {
            System.out.println(A.x);
            B b= new B();
            b.display();
            b.m1();
        }
    }
    