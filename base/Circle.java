package base;
import myInterface.Shape;

/**
 * Circle 클래스
 *
 * @author (2018243144 노무라타카미치 2018190042 모리모토 케이)
 * @version (20190909)
 */
public class Circle implements Shape
{
    public int x;
    public int y;
    public int radius;
    public Circle(int x,int y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw(){
        
    }
    public double getArea(){
        return radius * radius * PI;
    }
    public boolean equals(){
        return ;
    }
}
