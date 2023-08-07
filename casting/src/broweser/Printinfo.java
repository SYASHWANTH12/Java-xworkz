package broweser;

public class Printinfo {
	
	public  void Ranjith(Broweser browser)
	{
		System.out.println("invoking the parent class");
		Broweser b1=new OpenBrowser();
		System.out.println("Running the size="+b1.size);
		b1.Ser();
		OpenBrowser open=(OpenBrowser)b1;
		open.Open();
		System.out.println(open.name);
		OpenBrowser o1=new Edge();
		o1.Open();
		System.out.println(o1.name);
		Edge e1=(Edge)o1;
		e1.GE();
		System.out.println("Running the price="+e1.price);
		OpenBrowser o2=new FireFox();
		FireFox f1=(FireFox)o2;
		f1.Fox();
		System.out.println(f1.name);
		
		
				}
		
	}


