package room;

/**
 * Creates a room object for the purpose of 
 * easily storing and retrieving 
 * information about that room
 * @author Kyle
 *
 */
public class Room 
{
	String roomName;
	String wallColor;
	String floorType;
	int numWindows;
	
	/**
	 * initializes a room with no 
	 * set attributes
	 */
	public Room()
	{
	}
	
	/**
	 * initializes the attributes of the room
	 * to specific values
	 * @param roomName
	 * @param wallColor
	 * @param floorType
	 * @param numWindows
	 */
	public Room(String roomName, String wallColor, String floorType, int numWindows) 
	{
		super();
		this.roomName = roomName;
		this.wallColor = wallColor;
		this.floorType = floorType;
		this.numWindows = numWindows;
	}
	
	/**
	 * Get Room Name
	 * @return the name of the room as a string
	 */
	public String getRoomName() 
	{
		return roomName;
	}
	
	/**
	 * Set the name of the room
	 * @param roomName
	 */
	public void setRoomName(String roomName) 
	{
		this.roomName = roomName;
	}
	
	/**
	 * Get Wall Color
	 * @return the color of the walls as a string
	 */
	public String getWallColor() 
	{
		return wallColor;
	}

	/**
	 * Set the color of the walls in the room
	 * @param wallColor
	 */
	public void setWallColor(String wallColor) 
	{
		this.wallColor = wallColor;
	}

	/**
	 * Get Floor Type
	 * @return the type of flooring in the room
	 */
	public String getFloorType() 
	{
		return floorType;
	}

	/**
	 * Set the type of flooring in the room
	 * @param floorType
	 */
	public void setFloorType(String floorType) 
	{
		this.floorType = floorType;
	}

	/**
	 * Get Number of Windows
	 * @return the number of windows in the room
	 */
	public int getNumWindows() 
	{
		return numWindows;
	}

	/**
	 * Set the number of windows in the room
	 * @param numWindows
	 */
	public void setNumWindows(int numWindows) 
	{
		this.numWindows = numWindows;
	}
	
	/**
	 * Returns the values of each of the room's attributes
	 */
	public String toString()
	{
		return roomName + " has " + wallColor + " walls, " + floorType + " floors, and " + numWindows + " window(s)";
	}
	
}