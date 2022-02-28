import java.util.*;

class Point implements Comparable{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x = " + x + " y = " + y;
    }
    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if(x < p.x){
            return -1;
        }else if (x > p.x){
            return 1;
        }else{
            if(y < p.y){
                return -1;
            }else if (y > p.y){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet <Point> ts = new TreeSet<>();
        ts.add(new Point(1,3));
        ts.add(new Point(3,5));
        ts.add(new Point(3,4));
        ts.add(new Point(2,3));
        System.out.println(ts);
    }
}
