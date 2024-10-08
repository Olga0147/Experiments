package olga0147.ex2;

import olga0147.ex2.annotations.Annotations;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PrimitiveTypes pt = new PrimitiveTypes();
    	//pt.run();
    	Literals ls = new Literals();
    	//ls.run();
    	ArraysNotCollection anc = new ArraysNotCollection();
    	//anc.run();
    	Methods m = new Methods();
    	//m.run();
    	WrappedTypes wt = new WrappedTypes();
    	//wt.run();
    	EnumRun er = new EnumRun();
    	//er.run();
		Annotations a = new Annotations();
		a.run();
    	
    	//System.out.println( "Hello World!" );
    }
}
