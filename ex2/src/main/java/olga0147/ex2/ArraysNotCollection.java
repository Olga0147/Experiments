package olga0147.ex2;

public class ArraysNotCollection {
	
	public void run() {
		
		int iarr[][];//объявление
		iarr = new int[10][];//выделение памяти для первого измерения
		iarr[0] = new int[5];//выделение памяти для 2-ого измерения отдельно для каждой строки
		iarr[0] = new int[10];//можно сделать неоднородный массив
		
		float farr[][] = new float[10][5];//объявление + выделение памяти
		
		short sarr[][] = {{1,1,1} ,{2,2}};//через инициализацию
		for(int i = 0; i < sarr.length; i++) {
			for(int j = 0; j<sarr[i].length; j++) {
				System.out.print( sarr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		double[] darr;//альтернативный синтаксис объявления
	}
	

}
