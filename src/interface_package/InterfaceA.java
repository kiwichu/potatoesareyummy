package interface_package;

public interface InterfaceA {
    //in interface you can only use final, static
    int num =55;
    public void printMessage(String message);
    default void eatFood(String food){
        System.out.println("Eating "+food);
        //in order for it to be not an abstract you put default (only true for interface)
        //static is when the variables would be different for each object
        // when it is static, all the objects would refer to the same value,
        //that variable would be the same for all the objects
    }
}
