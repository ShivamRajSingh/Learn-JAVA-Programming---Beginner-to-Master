class Cylinder{
    private double radius;
    private double height;

    public Cylinder(){
        radius = 1;
        height = 1;
    }

    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setDimesions(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double volume(){
        return Math.PI * Math.pow(radius,2) * height;
    }

    public double curvedSurfaceArea(){
        return 2 * Math.PI * radius * height;
    }

    public double surfaceArea(){
        return curvedSurfaceArea() + 2 * Math.PI * Math.pow(radius, 2);
    }

    public String toString(){
        return "\nVolume : " + volume() + "\nCSA : " + curvedSurfaceArea() + "\nTSA : " + surfaceArea();
    }
}

public class CylinderMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7.5,14);

        System.out.println("Details of Cylinder : " + cylinder);
    }
}
