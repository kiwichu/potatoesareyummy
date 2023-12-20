package class_package;

public class Test {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.setNum(5);

        StaticClass staticClass2 = new StaticClass();
        staticClass2.setNum(6);
        System.out.println(staticClass2.getNum());

        StaticClass staticClass3 = new StaticClass();
        System.out.println(staticClass3.getNum());


    }
}
