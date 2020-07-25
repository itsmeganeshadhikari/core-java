package section5.enumdemo;

public enum LevelEnum {

	Low(1), Medium(2), High(3);

	private int value;

	private LevelEnum(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		for(LevelEnum l:LevelEnum.values()) {
			System.out.println(l.name()+" "+l.getValue());
		}
	}
}
