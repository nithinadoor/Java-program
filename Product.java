public class Product {
    int Pcode,Price;
    String Pname;
    Product(int x, String y, int z)
    {
        Pcode = x;
        Pname = y;
        Price = z;
    }
    static void Compare(Product pd1,Product pd2,Product pd3)
    {
        if(pd1.Price<pd2.Price && pd1.Price<pd3.Price)
        {
            System.out.println("Price of"+pd1.Pname+" is lowest");
        }
        else if(pd2.Price<pd1.Price && pd2.Price<pd3.Price)
        {
            System.out.println("price of"+pd2.Pname+" is lowest");
        }
        else if(pd3.Price<pd1.Price && pd3.Price<pd2.Price)
        {
            System.out.println("price of"+pd3.Pname+" is lowest");
        }
    }
    public static void main(String args[]) 
    {
        Product pd1 = new Product(101, "Book1", 120);
        Product pd2 = new Product(102,"Book2",160);
        Product pd3 = new Product(103, "Book3", 130);

        Compare(pd1,pd2,pd3);
    }
}
