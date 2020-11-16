package basics;

class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class TestSingleInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }}

class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

class TestMultilevelInheritance{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}

class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
class TestHierarchicalInheritance{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
        //c.bark();//C.T.Error - cannot resolve method bark
    }}