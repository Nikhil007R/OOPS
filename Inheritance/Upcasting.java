class Animal {

    String name = "Camel";

    public void eat() {
        System.out.println("Animals can eat: ");
    }
}

class Dog extends Animal {
    String name = "Dog";
}

class Upcasting {
    public static void main(String[] args) {

        Animal d1 = new Dog();
        d1.eat();

        System.out.println(d1.name);

    }
}