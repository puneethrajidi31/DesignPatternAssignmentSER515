import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trading {

	private Product product;

	private OfferingList offeringList;
	
	public int bidvalue(String dish) throws FileNotFoundException
	{
		System.out.println("Printing the result of visitor design pattern");
		int result=0;
		File file=new File("UserProduct");
		Scanner s=new Scanner(file);
		while(s.hasNextLine())
		{
			String a[]=s.nextLine().split(":");
			if(a[1].equals(dish))
			{
				System.out.println(a[0]);
				result++;
			}
		}
		System.out.println("Currently "+result+" number of users are linked with this dish");
		return 0;
	}

	public void accept(NodeVisitor visitor) {

	}

}
