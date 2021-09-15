public class Ball {
    private double x=0.0;
    private double y=0.0;
    public Ball(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Ball(){};

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y){

    }
    public void move(double xDisp,double yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }
    public void velosityUp(double V0) {
        double h1=0.0f;
        double h2=0.0f;
        double t=0.0f;
        System.out.println("Бросок:\n"+toString());

        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
            t+=0.1;
            h1=V0*t-9.8*t*t/2;
            move(0,h1-h2);
            h2=h1;
            if(y<0)setY(0);
            System.out.println(toString());
        }while(y!=0);
        System.out.println(t);
    }
    @Override
    public String toString() {
        String strx = String.format("%.3f",x);
        String stry = String.format("%.3f",y);
        return "Ball @ {" +
                "x=" + strx +
                ", y=" + stry +
                '}';
    }
}
