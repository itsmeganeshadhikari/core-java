package section5.enumdemo;

public enum Car {

	BMW {
		public int getPrice() {
			return 25;
		}
	}

	,
	MERCEDES {
		public int getPrice() {
			return 35;
		}
	},
	PORCHE {
		public int getPrice() {
			return 45;
		}
	};

	public abstract int getPrice();
	
	public static void main(String[] args) {
		for (Car c : Car.values()) {
			System.out.println(c.name()+" "+c.getPrice());
		}
		
		System.out.println(Car.valueOf("BMW"));
	}
}
