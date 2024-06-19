package olga0147.ex2;
/**
 * Wrapper classes are the most used classes in a Java application, similar to String class. 
 * Fortunately, similar to String class, wrapper classes are immutable in Java. 
 * So, like string pool, we can also have their pool as well.
 */
public class WrappedTypes {


	public void run() {
		
		boolEq();
		intEq();
		shorEq();
	}
	
	
	private void boolEq() {
		System.out.println("-----------------------------Boolean");
		Boolean b1 = true;
		Boolean b2 = true;
		
		if(b1.equals(b2)) {
			System.out.println("b1.equals(b2)");
		}
		if(b1 == b2) {
			System.out.println("b1 == b2");
		}
		if(b1.hashCode() == b2.hashCode()) {
			System.out.println("b1.hashCode() == b2.hashCode()");
		}
		if(b1.compareTo(b2) == 0) {
			System.out.println("b1.compareTo(b2) == 0");
		}
	}
	
	private void intEq() {
		System.out.println("-----------------------------Integer 127, В Java есть пул(pool) целых чисел в промежутке [-128;127]. ");
		Integer i1 = 127;
		Integer i2 = 127;
		
		if(i1.equals(i2)) {
			System.out.println("b1.equals(b2)");
		}
		if(i1 == i2) {
			System.out.println("b1 == b2");
		}
		if(i1.hashCode() == i2.hashCode()) {
			System.out.println("b1.hashCode() == b2.hashCode()");
		}
		if(i1.compareTo(i2) == 0) {
			System.out.println("b1.compareTo(b2) == 0");
		}
		System.out.println("-----------------------------Integer 128");
		i1 = 128;
		i2 = 128;
		if(i1.equals(i2)) {
			System.out.println("b1.equals(b2)");
		}
		if(i1 == i2) {
			System.out.println("b1 == b2");
		} else {
			System.out.println("b1 != b2");
		}
		if(i1.hashCode() == i2.hashCode()) {
			System.out.println("b1.hashCode() == b2.hashCode()");
		}
		if(i1.compareTo(i2) == 0) {
			System.out.println("b1.compareTo(b2) == 0");
		}
		System.out.println("-----------------------------new Integer 127, не берет из пула");
		Integer j1 = new Integer(127);
		Integer j2 = new Integer(127);
		if(j1.equals(j2)) {
			System.out.println("b1.equals(b2)");
		}
		if(j1 == j2) {
			System.out.println("b1 == b2");
		}
		if(j1.hashCode() == j2.hashCode()) {
			System.out.println("b1.hashCode() == b2.hashCode()");
		}
		if(j1.compareTo(j2) == 0) {
			System.out.println("b1.compareTo(b2) == 0");
		}
	}

	private void shorEq() {
		System.out.println("-----------------------------Short");
		Short b1 = 127;
		Short b2 = 127;
		
		if(b1.equals(b2)) {
			System.out.println("b1.equals(b2)");
		}
		if(b1 == b2) {
			System.out.println("b1 == b2");
		}
		if(b1.hashCode() == b2.hashCode()) {
			System.out.println("b1.hashCode() == b2.hashCode()");
		}
		if(b1.compareTo(b2) == 0) {
			System.out.println("b1.compareTo(b2) == 0");
		}
		
		Integer i2 = 127;
		if(b1.hashCode() == i2.hashCode()) {
			System.out.println("b1.hashCode() == i2.hashCode(), b1.hashCode()=" + b1.hashCode());
		}
		
	}
}
