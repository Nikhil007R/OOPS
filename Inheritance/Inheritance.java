class Animal {

    public void eat() {
        System.out.println("Animals can eat: ");
    }
}

class Dog extends Animal {

}

class Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();
    }
}