package section5.enumdemo;

public class Demo {
	public static final String EAST = "east";
	public static final String WEST = "west";
	public static final String SOUTH = "south";
	public static final String NORTH = "North";

	public static void main(String[] args) {
		System.out.println(Demo.SOUTH);

		switch (Demo.NORTH) {
		case "east":
			System.out.println("east direction");
			break;
		case "west":
			System.out.println("west direction");
			break;
		case "south":
			System.out.println("south direction");
			break;
		case "north":
			System.out.println("north direction");
			break;

		default:
			System.out.println("wrong direction");
		}
	}

}
