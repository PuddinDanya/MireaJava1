package Kniga;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("1984", 354,"Anti-Utopia" );
        Book d2 = new Book("War and Peace",1300 ,"Romance");
        Book d3 = new Book("50 shades of grey",528,"Drama");
        System.out.println(d1);
        d1.pechat();
        d2.pechat();
        d3.pechat();
    }
}
