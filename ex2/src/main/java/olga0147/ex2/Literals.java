package olga0147.ex2;

public class Literals {
	
	int c = 5, d;
	
	public void run() {
		System.out.println(0b10001);//2 cc
		System.out.println(021);//8 cc
		System.out.println(17);//10 cc
		System.out.println(0x11);//16 сс
		
		System.out.println(17L);
		System.out.println(17F);
		System.out.println(17D);
		System.out.println(1.7E1);
		System.out.println(1.7E+1);
		
		System.out.println('a');
		System.out.println('\141');//8-и разрядное значение
		System.out.println('\u0061');//16-и разрядное значение
		System.out.println("a");
		
		System.out.println("aaaa");//объект, а не массив символов!
		
		int a = 5, b = 6;
		System.out.println(a + b);
		System.out.println(c + d);
		
		
		int c = 0;//тут переменная перекрыла
		System.out.println(c);
		System.out.println(this.c);//тут явно обратились к переменной объекта, а не локальной
		{
			//int c =1;//Duplicate local variable c
		}
		
		
	}

}
