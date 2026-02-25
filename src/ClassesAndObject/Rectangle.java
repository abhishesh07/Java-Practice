package ClassesAndObject;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = (width>1) ? width : 1;
    }
    public void setHeight(double height){
        this.height = (height>1) ? height : 1;
    }
}
