import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass mySecondClass = new MySecondClass(1010101, 101);
        System.out.println(mySecondClass.integerDivision());

        for(int i = 1; i <= 8; i++) {
            for(int j = 1; j <= 8; j++) {
                mySecondClass.setA(i);
                mySecondClass.setB(j);
                System.out.print(mySecondClass.integerDivision());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}