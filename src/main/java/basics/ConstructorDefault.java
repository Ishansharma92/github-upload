package basics;

public class ConstructorDefault {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ConstructorDefault s1 = new ConstructorDefault();
        ConstructorDefault s2 = new ConstructorDefault();
        s1.display();
        s2.display();
    }
}

