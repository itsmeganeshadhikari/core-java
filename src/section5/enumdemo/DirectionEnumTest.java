package section5.enumdemo;

public class DirectionEnumTest {

	public static void main(String[] args) {
		System.out.println(DirectionEnum.EAST);
		
		for(DirectionEnum d: DirectionEnum.values()) {
			System.out.println(d.name()+" "+d.ordinal());
		}
		
		switch (DirectionEnum.NORTH) {
		case EAST:
			System.out.println("east direction");
			break;
		case WEST:
			System.out.println("west direction");
			break;
		case SOUTH:
			System.out.println("south direction");
			break;
		case NORTH:
			System.out.println("north direction");
			break;

		default:
			System.out.println("wrong direction");
		}
	}

}
