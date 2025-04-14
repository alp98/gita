public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint p= new MyPoint(1,1);
                System.out.println(p.getDistance(2,2));
    }
}
class MyPoint {

    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {

        int dx = x1 - this.x;
        int dy = y1 - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}


