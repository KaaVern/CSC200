package roomDriver;

import room.Room;

public class RoomDriver 
{
	public static void main(String[] args) 
	{
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		
		room1.setRoomName("Room 1");
		room1.setWallColor("yellow");
		room1.setFloorType("hard wood");
		room1.setNumWindows(1);
		
		room2.setRoomName("Room 2");
		room2.setWallColor("purple");
		room2.setFloorType("tile");
		room2.setNumWindows(0);
		
		room3.setRoomName("Room 3");
		room3.setWallColor("white");
		room3.setFloorType("carpetted");
		room3.setNumWindows(3);
		
		System.out.println(room1.toString());
		System.out.println(room2.toString());
		System.out.println(room3.toString());
	}
}