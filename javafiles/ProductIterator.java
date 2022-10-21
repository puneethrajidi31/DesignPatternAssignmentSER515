import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductIterator {

	private ClassProductList classProductList;

	public boolean hasNext() throws FileNotFoundException {
		File file=new File("UserProduct");
		Scanner s=new Scanner(file);
		while(s.hasNextLine())
		{
			System.out.println(s.nextLine());
		}
		return true;
	}

	public Product Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
