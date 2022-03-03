package SetAndHashCode10;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReferenceSetProgram {
    public static void main(String[] args) {
        Set<Point> points=new LinkedHashSet<Point>() ;
        Point p1=new Point(4,4);
        points.add(new Point(1,1));
        points.add(new Point(2,2));
        points.add(new Point(1,1));
        points.add(p1);
        System.out.println("thare are "+points.size()+" in set:\n "+points);


    }
}
