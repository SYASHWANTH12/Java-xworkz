package casting;

public class ShowRoomUtil {
	public static void Run(ShowRoom Room)
	{
		System.out.println("Invoking the showroom");
		ShowRoom room=new WatchShowRoom();
		ShowRoom r1=new MobileShowRoom();
		room.Room();
		System.out.println("Running the price "+room.name);
		WatchShowRoom show=(WatchShowRoom)room;
		show.Show();
		System.out.println("Running the ="+show.type);
		MobileShowRoom mobile=(MobileShowRoom)r1;
		System.out.println(mobile.price);
		mobile.Mobile();
		
	}

}
