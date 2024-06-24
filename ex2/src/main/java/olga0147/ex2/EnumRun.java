package olga0147.ex2;

public class EnumRun {
	enum EnumDay{
		MON, SUN;
	}

	enum Direction {
		  EAST(0), WEST(180), NORTH(90), SOUTH(270);

		  private Direction(final int angle) {
		    this.angle = angle;
		  }

		  private int angle;

		  public int getAngle() {
		    return angle;
		  }
		}
	
	
	public void run() {
		
		EnumDay m = EnumDay.MON;
		//EnumDay m1 = EnumDay.valueOf("mon");// No enum constant olga0147.ex2.EnumRun.EnumDay.mon
		EnumDay m1 = EnumDay.valueOf("MON");
		EnumDay[] days = EnumDay.values();
		
		if(m1.equals(m)) {
			System.out.println( "m1.equals(m) ");
		}
		if(m1 == m) {
			System.out.println( "m1 == m");
		}
		if(m.compareTo(m1) == 0) {
			System.out.println( "m.compareTo(m1)");
		}
		if(m.hashCode() == m1.hashCode()) {
			System.out.println( "m.hashCode() == m1.hashCode()");
		}
		System.out.println( "m.ordinal() = " + m.ordinal());
		System.out.println( "m.name() = " + m.name());
		System.out.println( "Direction.EAST = " + Direction.EAST);
		System.out.println( "Direction.T.angle = " + Direction.EAST.angle);
	}
 }
