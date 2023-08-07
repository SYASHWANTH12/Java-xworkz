package chocolate;

public class CRunner {
public static void main(String[] info)
{
	DarkChocolate d1=new CaramelChocolate();
	d1.Chocolate();
	System.out.println("Running the name of the chocalte="+d1.name);
	CaramelChocolate c1=(CaramelChocolate)d1;
	c1.Caramel();
	System.out.println("Running the caramel="+c1.price);
	
	
}
}
