package main;
import base.Circle;
/**
 * myApp 클래스
 * 
 * @author (2018243144 노무라 타카미치 2018190042 모리모토 케이)
 * @version (20190909)
 */
public class myApp
{
    public static void main(String[] args){
        Circle c1 = new Circle(2, 3, 5);
        Circle c2 = new Circle(2, 3, 10);
        System.out.println("원1 :" +c1);
        System.out.println("원2 :" +c2);
        if(c1.equals(c2)){
            System.out.println("같은 원");
        }else{
            System.out.println("서로 다른 원");
        }
    }
}
