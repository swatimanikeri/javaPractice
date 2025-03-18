class Animal {
    public void m1() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    public void m1() {
        System.out.println("Dog");
    }
}

 class Test1 {
    public static void main(string[] args) {
        Dog d = new Dog(); // Corrected from Dod to Dog
        d.m1(); // This will call the Dog class method due to method overriding
    }
}
