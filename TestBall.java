package Myachik;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Green", 3,"Football" );
        Ball d2 = new Ball("Yellow", 5,"Volleyball");
        Ball d3 = new Ball("Red", 7,"Basketball");
        System.out.println(d1);
        d1.pechat();
        d2.pechat();
        d3.pechat();
    }
}
