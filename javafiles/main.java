import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Facade facade=new Facade();
		boolean auth=facade.login();
		if(auth==true)
		{
			System.out.println("Menu Options: Please enter 0 for Meat Option and Please enter 1 for Produce Option");
			int x=-1;
			Scanner scan=new Scanner(System.in);
			try
			{
			int in=scan.nextInt();
			x=in;
			} catch(Exception e)
			{
				System.out.println("Wrong Input type");
			}
		    if(x==0)
		    {
		    	MeatProductMenu meatproduct=new MeatProductMenu();
		    	System.out.println("Utilizing the Factory Design pattern");
		    	System.out.println("");
		    	meatproduct.showMenu();
		    	System.out.println("");
		    	System.out.println("Utilized the Bridge Design pattern");
		    	
		    }
		    else if(x==1)
		    {
		    	ProduceProductMenu producemenu=new ProduceProductMenu();
		    	System.out.println("Utilizing the Factory Design pattern");
		    	System.out.println("");
		    	producemenu.showMenu();
		    	System.out.println("");
		    	System.out.println("Utilized the Bridge Design pattern");
		    	
		    }
		    else
		    {
		    	System.out.println("Incorrect Input");
		    }
		    System.out.println("");
		    System.out.println("Printing the Output of Iterator design pattern");
		    System.out.println("");
		    ProductIterator productiterator=new ProductIterator();
		    productiterator.hasNext();
		    System.out.println("");
		    System.out.println("What dish do you like to order?");
		    String dish=scan.next();
		    Trading trading = new Trading();
		    trading.bidvalue(dish);
		}
}
}
