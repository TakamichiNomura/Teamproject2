package myInterface;


/**
 * Shapeインターフェイス
 * 
 * @author (2018243144 노무라 타카미치 2018190042 모리모토 케이) 
 * @version (20190902)
 */
public interface Shape{ 
    final double PI = 3.14; 
    void draw(); 
    double getArea(); 
    default public void redraw(){ 
        System.out.print("--- 다시 그립니다. "); 
        draw(); 
    }
}
