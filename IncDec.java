public class IncDec {
    public static void main(String[] args) {
        int x=42;
        int y;
        y = x++;
        System.out.println("y = " + y);;
        System.out.println("x = " + x);

        int a=0, b;
        //b = a++ + a++;  //0+1
        b = --a + a++;  //-1+0
        System.out.println(b); //1    //-1 +(-1)
        System.out.println(a); //2    //-0

    }
}
