package Practise_Interface;

public class TestClass {

    public static void main(String[] args) {
        ColorInterface clr = new BluePainter();
        clr.paint();
        clr.brush();
        clr.paintCatalog();
        ColorInterface.paintBox();
    }
}
