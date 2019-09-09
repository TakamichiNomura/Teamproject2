package myInterface;


/**
 * インターフェイス
 * 
 * @author (2018190042 모리모토 케이) 
 * @version (20190902)
 */
interface Shape{ 
    final double PI = 3.14; 
    void draw(); 
    double getArea(); 
    default public void redraw(){ 
        System.out.print("--- 다시 그립니다. "); 
        draw(); 
    }
}
