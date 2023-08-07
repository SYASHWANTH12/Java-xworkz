package zoo;

public class ZooRunner {
	public static void main(String[] info)
	{
		StateZoo z1=new NationalZoo();
	 z1.State();
	 System.out.println("Running the zoo="+z1.animal);
	 NationalZoo n1=(NationalZoo)z1;
	 System.out.println("Runnning the national="+n1.national);
	 n1.National();	 
	}
}
