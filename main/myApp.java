package main;
import base.Circle;
/**
 * クラス myApp の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class myApp
{
    public static void main(String[] args){
        Circle c1 = new Circle(2, 3, 5);
        Circle c2 = new Circle(2, 3, 10);
        System.out.println("원1 :" +c1);
        System.out.println("원2 :" +c2);
        if(){
            System.out.println("같은 원");
        }
        else{
            System.out.println("서로 다른 원");
        }
    }
}
