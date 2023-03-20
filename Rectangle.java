
import java.util.*;
public class Rectangle {
    int length;
    int breadth;
    public void set_data(){
        length=10;
        breadth=12;
    }
    public void get_area(){
        int area=length*breadth;
        System.out.println("area="+area);
    }
    public static void main(String args[])
    {
        Rectangle obj=new Rectangle();
        obj.set_data();
        obj.get_area();
    }
}
