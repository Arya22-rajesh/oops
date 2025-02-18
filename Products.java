class Products
{
    int pcode,price;
    String pname;
    Products(int c,String n,int p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
   public void display()
   {
    System.out.println("Product code:"+pcode);
    System.out.println("Product name:"+pname);
    System.out.println("Product price:"+price);
   }

public static void main(String[]args)
{
Products Product1=new Products(101,"phone1",500);
Products Product2=new Products(102,"laptop2",400);
Products Product3=new Products(103,"tv3",200);
Products lowestPriceProduct = Product1;
if (Product2.price<lowestPriceProduct.price)
{
lowestPriceProduct=Product2;
}
if (Product3.price<lowestPriceProduct.price)
{
lowestPriceProduct=Product3;
}
System.out.println("Product with the lowest price is:");
lowestPriceProduct.display();
   }
   }

