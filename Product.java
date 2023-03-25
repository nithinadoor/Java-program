public class Product{
    int pcode;
    String pname;
    int price;

    Product(int x,String y,int z)
    {
        pcode=x;
        pname=y;
        price=z;
    }
    public static void main(String args[])
    {
        Product p1=new Product(1, "abc", 100);
        Product  p2=new Product(2, "xyz", 200);
        Product p3=new Product(3, "pqr", 300);
    
        if(p1.price>p2.price && p1.price>p3.price)
        {
            System.out.println("price of product 1 is greater");
        }
        else if(p2.price>p1.price && p2.price>p3.price)
        {
            System.out.println("price of p2 is greater");
        }
        else{
            System.out.println("price of product 3 is greater");
        }
    }

}
