class Animal {

    public void eat() {
        System.out.println("Animals can eat: ");
    }
}

class Dog extends Animal {

    // public int eat() {
    public void eat() {
        System.out.println("Dogs can eat: ");
        // return 2;
    }
}

class MethodOverridding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        // Animal d2 = new Dog();
        d1.eat();
        // d2.eat();
    }
}