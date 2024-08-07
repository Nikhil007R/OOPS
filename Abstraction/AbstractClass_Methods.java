abstract class A {

    abstract void callme();

    abstract void speak();
}

class B extends A {

    void callme() {
        System.out.println("Calling via abstract class: ");
    }

    void speak() {
        System.out.println("Now Speaking: ");
    }
}

class AbstractClass_Methods {
    public static void main(String[] args) {
        B obj = new B();
        obj.callme();
        obj.speak();
    }
}