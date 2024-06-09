package olga0147.ex2;

public class PrimitiveTypes {
	
	byte a1;
	short s1;
	int i1;
	long l1;
	
	char c1;
	
	boolean b1;
	
	float f1;
	double d1;

	public void run(){
		
		System.out.println("a1=" + a1);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		System.out.println("c1=" + c1);
		System.out.println("b1=" + b1);
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		System.out.println("-----------------------------");
		System.out.printf("byte max %s , min %s %n", Byte.MAX_VALUE, Byte.MIN_VALUE);
		System.out.printf("short max %s , min %s %n", Short.MAX_VALUE, Short.MIN_VALUE);
		System.out.printf("char max %s , min %d %n", (int)Character.MAX_VALUE, (int)Character.MIN_VALUE);
		System.out.printf("int max %s , min %s %n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.printf("long max %s , min %s %n", Long.MAX_VALUE, Long.MIN_VALUE);
		System.out.printf("float max %s , min %s %n", Float.MAX_VALUE, Float.MIN_VALUE);
		System.out.printf("double max%s , min %s %n", Double.MAX_VALUE, Double.MIN_VALUE);
		System.out.println("-----------------------------Явное преобразование типов (сужающее) = x mod диапазон_целевого_типа");
		a1=(byte) 256;
		System.out.println("a1=" + a1);
		s1 = (short) 65536;//=65536 mod 32768 = 0
		System.out.println("s1=" + s1);
		//s1 = (short) 2_147_483_648;//The literal 2_147_483_648 of type int is out of range 
		s1 = (short) 2_147_483_648L;
		System.out.println("s1=" + s1);
		System.out.println("-----------------------------Явное преобразование типов (усечение) = отсекается всё после точки");
		i1 = (int)2.5;
		System.out.println("i1=" + i1);
		i1 = (int)2.9;
		System.out.println("i1=" + i1);
		System.out.println("-----------------------------Автоматич. преобразование в выражениях к int");
		a1 = 1; s1 = 3;
		i1 = a1 + s1;
		//a1 = a1 + s1;//Type mismatch: cannot convert from int to byte
		System.out.println("i1=" + i1);
		System.out.println("-----------------------------Автоматич. преобразование в выражениях к float/float");
		f1 = f1 + s1;
		//i1 = f1 + s1;//Type mismatch: cannot convert from float to int
		System.out.println("f1=" + f1);
		//f1 = d1 + s1;//Type mismatch: cannot convert from double to float
		d1 = d1 + s1;
		System.out.println("d1=" + d1);

		
		
	}
}
