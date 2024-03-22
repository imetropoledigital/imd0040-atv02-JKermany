public class Circle {

    
public float radius;

public Circle(float radius){
    this.radius = radius;
}

public double area(){
    double areacir =  this.radius * this.radius * Math.PI;
    return areacir;
}

public double  circumference(){
    double circumcir = this.radius * Math.PI * 2;
    return circumcir;
}

}
