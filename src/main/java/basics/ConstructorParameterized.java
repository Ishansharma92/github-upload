package basics;

public class ConstructorParameterized {

    int id;
    String name;

    ConstructorParameterized(int i, String n) {
        id = i;
        name = n;

    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ConstructorParameterized s3 = new ConstructorParameterized(10, "Ishan");
        ConstructorParameterized s4 = new ConstructorParameterized(100, "Mahesh");
        s3.display();
        s4.display();
    }
}
