package basics;

public class GenericSubClass<T>{
    T ob;
    GenericSubClass(T ob){
        this.ob=ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }
}
