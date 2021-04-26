
public class PrincipalPoint1 {
public static void main(String[] args) {
Point p1 = new Point();
p1.setX(4);
p1.setY(4);

Point p2 = new Point();
p2.setX(4);
p2.setY(5);

Point midPoint =p1.midPoint1(p2);
System.out.println(midPoint.getX());
System.out.println(midPoint.getY());
/*

//double dist = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)
// + Math.pow(p1.getY()-p2.getY(),2));
double dist = p1.distance(p2);
System.out.println(dist);

double dist2 = p1.distance(p1);
System.out.println(dist2);

double dist3 = p1.distance(p2.getX(), p2.getY());
System.out.println(dist3);*/
}
}