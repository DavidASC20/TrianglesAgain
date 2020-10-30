public class Point{
    private double x,y;

    //construct a point given coordinates
    public Point(double X, double Y){
      x=X;
      y=Y;
    }
  
    //construct a point given a point  (redundant , just provides flexibility)
    public Point(Point p){
      x= p.x;  //private access in the same file is allowed!
      y= p.y;
    }
  
    public double getX(){
      return x;
    }
  
    public double getY(){
      return y;
    }  

    public double distanceTo(Point other) {
        double otherx = other.getX();
        double othery = other.getY();
        double result = Math.sqrt(((otherx-x) * (otherx-x)) + ((othery-y) *
        (othery-y)));
        return(result);
      }

    public boolean equals(Point other) {
        return(x == other.x && y == other.y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(3.0, 0.0);
        Point point2 = new Point(0.0, 0.0);
        Point point3 = new Point(0.0, 4.0);
        Point point4 = new Point(3.0, 0.0);
        System.out.println(point1.distanceTo(point2));
        System.out.println(point2.distanceTo(point3));
        System.out.println(point1.distanceTo(point3));
        System.out.println(point1.equals(point4));
        System.out.println(point1.equals(point2));
    }
}