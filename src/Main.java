public class Main {
    public static void main(String[] args) {
        Ball ball1=new Ball();
        System.out.println(ball1.toString());
        ball1.move(11,21);
        System.out.println(ball1.toString());
        ball1.velosityUp(10);
    }
}
