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
	    	meatproduct.showMenu();
	    }
	    else if(x==1)
	    {
	    	ProduceProductMenu producemenu=new ProduceProductMenu();
	    	producemenu.showMenu();
	    }
	    else
	    {
	    	System.out.println("Incorrect Input");
	    }
		
		}
}
}
