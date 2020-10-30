public class Triangle{
    private Point v1, v2, v3;
    
    public Triangle(Point a, Point b, Point c){
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }


    public double getPerimeter(){
        double side1 = v1.distanceTo(v2);
        double side2 = v2.distanceTo(v3);
        double side3 = v3.distanceTo(v1);
        return side1 + side2 + side3;
    }

    public double getArea(){
        double side1 = v1.distanceTo(v2);
        double side2 = v2.distanceTo(v3);
        double side3 = v3.distanceTo(v1);

        double semiperimeter = (side1 + side2 + side3) / 2;
        double realSide1 = semiperimeter - side1;
        double realSide2 = semiperimeter - side2;
        double realSide3 = semiperimeter - side3;

        return Math.sqrt(semiperimeter * realSide1 * realSide2 * realSide3);
    }

    // public String classify(){
    //     double side1 = v1.distanceTo(v2);
    //     double side2 = v2.distanceTo(v3);
    //     double side3 = v3.distanceTo(v1);

    //     double rounded1 = Math.floor(side1 * 10000) / 10000;
    //     double rounded2 = Math.floor(side2 * 10000) / 10000;
    //     double rounded3 = Math.floor(side3 * 10000) / 10000;

    //     if(rounded1 == rounded2 && rounded1 == rounded3 && rounded2 == rounded3){
    //         return "equilateral";
    //     }else if(rounded1 == rounded2 || rounded2 == rounded3 || rounded3 == rounded1){
    //         return "isosceles";
    //     }
    //     return "scalene";
    // }

    public String classify() {
        double a = Math.round(((v1.distanceTo(v2)) * 10000.0)/ 10000.0);
        double b = Math.round(((v2.distanceTo(v3)) * 10000.0)/ 10000.0);
        double c = Math.round(((v3.distanceTo(v1)) * 10000.0)/ 10000.0);
        if (a == b || b == c || a == c) {
          if (a == b && b == c){
            return("equilateral");
          }
          return("isosceles");
        }
        return("scalene");
      }

    public String toString(){
        return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX() + ", " + v3.getY() + ")";
    }

    public void setVertex(int index, Point newP){
        if(index == 0){
            v1 = newP;
        }else if(index == 1){
            v2 = newP;
        }else if(index == 2){
            v3 = newP;
        }
    }



    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(0.0, 0.0, 3.0, 0.0, 0.0, 4.0);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getArea());
        System.out.println(triangle1.classify());
        System.out.println(triangle1.toString());
    }

}