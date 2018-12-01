public class Program {
    public static void main(String[] args) {

        int x=14000;
        double b=0.4;
        int a=1500;
        double c=0.12;

        x +=5;
        int y=3;

        double w =x*b;
        double w1 =x+w;
        System.out.println("Wartość inwestycji w pierwszym roku wynosi:" + w1);

        double w2 =w1-a;
        System.out.println("Wartość inwestycji w drugim roku wynosi:" + w2);
        double w3 =w2*c;
        double w4 =w3+w2;
        System.out.println("Wartość inwestycji w trzecim roku wynosi:" + w4);
        System.out.println(w3);

        //Zad2
        int p=5;
        System.out.println("Liczba1"+p);
        int o=8;
        System.out.println("Liczba2"+o);
       // double l= o\p;
       // double k= o%p;
      //  System.out.println("Wynik dzielenia  resztę dzielenia"+ k  l );



    }
}
