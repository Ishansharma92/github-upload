package Practise_Interface;

public interface ColorInterface {

    static String color = "Burgundy";
    final String design = "Printed";

    public void paint();
    public void brush();

    public static void paintBox(){
        System.out.println("Asian Paints");
    }
    default void paintCatalog(){
        System.out.println("Asian Paints Catalog Book");
    }

}
