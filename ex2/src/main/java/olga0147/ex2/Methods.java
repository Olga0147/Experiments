package olga0147.ex2;

public class Methods {
	
	public void run() {
		intM();
		booleanM();
		prM();

	}
	
	
	public void booleanM() {
		boolean a = true;
		boolean b = false;
		System.out.println("-----------------------------");
		System.out.println("!a =" + (!a));
		System.out.println("-----------------------------Укороч.логич. операция (правый не вычисляется, если понятно по левому результат)");
		System.out.println("a&&b =" + (a&&b));
		System.out.println("a||b =" + (a||b));
		System.out.println("-----------------------------НЕ Укороч.логич. операция");
		System.out.println("a&b =" + (a&b));
		System.out.println("a|b =" + (a|b));
		System.out.println("a^b =" + (a^b));
		System.out.println("-----------------------------");
		a|=false;
		System.out.println("a|false =" + (a));a=true;
		a&=false;
		System.out.println("a&false =" + (a));a=true;
		//a!=false;//Syntax error on token "!=", invalid AssignmentOperator
		//a&!=false;/Syntax error on tokens, delete these tokens
		a^=false;
		System.out.println("a^false =" + (a));a=true;
		//a||=false;//Syntax error on token "||", delete this token
	}

	public void intM() {
		int i = 0;
		int j = 0;
		System.out.println("i++=" + (i++) + ", i=" + i);
		System.out.println("++i=" + (++i) + ", i=" + i );
		//System.out.println("++i++=" + (++i++) + ", i=" + i );//Invalid argument to operation ++/--
		//System.out.println("++i=" + ((++i)++) + ", i=" + i );//Invalid argument to operation ++/--
		//System.out.println("++i=" + (++++i) + ", i=" + i );//Invalid argument to operation ++/--
		//System.out.println("++i=" + (++(++i)) + ", i=" + i );//Invalid argument to operation ++/--
		
		i = j = 0;
		System.out.println("(j+(++i))=" + (j+(++i)) + ", i=" + i );
		i = j = 0;
		System.out.println("(j+++i)=" + (j+++i) + ", i=" + i );
		i = j = 0;
		System.out.println("(j+++i)=" + ((j++)+i) + ", i=" + i + ",j=" + j);
		i = j = 0;
		System.out.println("(j+++i++)=" + (j+++i++) + ", i=" + i + ",j=" + j);
		i = j = 0;
		System.out.println("((j++)+(i++))=" + ((j++)+(i++)) + ", i=" + i + ",j=" + j);
		
		System.out.println("-----------------------------Поразрядные операции:long,int, short,char,byte");
		byte b = 0;//00000000
		System.out.print("b=" + (b) + ", " );
		printB((byte) (b));
		System.out.print("~b=" + (~b) + ", " );
		printB((byte) (~b));
		System.out.println("-----------------------------b=1,");
		b = 1;
		printB((byte) (b));
		System.out.print("b>>1=" + (b>>1) + ", " );
		printB((byte) (b>>1));
		System.out.print("b>>2=" + (b>>2) + ", " );
		printB((byte) (b>>2));
		System.out.print("b>>>1=" + (b>>>1) + ", " );
		printB((byte) (b>>>1));
		System.out.print("b<<1=" + (b<<1) + ", " );
		printB((byte) (b<<1));
		System.out.print("b<<7= (int)" + (b<<7) + ", (byte)" + ((byte)(b<<7)) + ", " );
		printB((byte) (b<<7));
		System.out.print("b<<7= (int)" + (b<<8) + ", (byte)" + ((byte)(b<<8)) + ", " );
		printB((byte) (b<<8));
		System.out.println("-----------------------------b=3,");
		b = 3;
		printB((byte) (b));
		System.out.print("b>>1=" + (b>>1) + ", " );
		printB((byte) (b>>1));
		System.out.print("b>>2=" + (b>>2) + ", " );
		printB((byte) (b>>2));
		System.out.print("b>>>1=" + (b>>>1) + ", " );
		printB((byte) (b>>>1));
		System.out.print("-----------------------------b=-3,");
		b = -3;
		printB((byte) (b));
		System.out.print("b>>1=" + (b>>1) + ", " );
		printB((byte) (b>>1));
		System.out.print("b>>2=" + (b>>2) + ", " );
		printB((byte) (b>>2));
		System.out.print("b>>>1= (int)" + (b>>>1) + ", (byte) " );
		printB((byte) (b>>>1));
		System.out.println(String.format("b>>>1=(int)%s", Integer.toBinaryString(((b>>>1)))).replace(' ', '0') + " ");
		System.out.println("-----------------------------Отриц число = положит число, инвертировать все биты и +1");
		b=-1;
		System.out.print("b=" + (b) + ", " );
		printB((b));
		b=-2;
		System.out.print("b=" + (b) + ", " );
		printB((b));
		
		//char c = -1;//Type mismatch: cannot convert from int to char
		
		
		
	}
	
	public void printB(byte b) {
		 System.out.println(String.format("%8s", Integer.toBinaryString((b) & 0xFF)).replace(' ', '0') + " ");
	}
	
	public void prM() {
		int x, y, z;
		System.out.println("-----------------------------");
		x = y = z = 10;
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		
		int a = 1, b = 12;
		System.out.println("a = " + a + ", b = " + b);
		
		//int o = p = 10;//p cannot be resolved to a variable
		
	}
}
