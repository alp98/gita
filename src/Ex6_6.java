public class Ex6_6 {
    static double getDistance (int x, int y, int x1, int y1) {
        int dx = x1 - x;
        int dy = y1 - y;
        return Math.sqrt(dx * dx + dy * dy);

    }
    public static void main(String[]args){
        System.out.println(getDistance(1,1,2,2));

    }

}