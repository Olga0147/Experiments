package olga0147.ex2.annotations;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


//@MyAnno3//'@MyAnno3' not applicable to type
@MyAnno1(str = "class", in = 1)
public class Annotations implements MyInterface{


    @Override
    @MyAnno4("hello")
    @MyAnno3
    @MyAnno1(in = 2, str = "method")
    @MyAnno2//не виден, так как CLASS, а не RUNTIME
    public void run() {

        @MyAnno1(str = "local var")
        String s1 = "";


        Class<? extends Annotations> cl = this.getClass();
        MyAnno1 cla = cl.getAnnotation(MyAnno1.class);
        System.out.println( "Annotation " + cla.str() + " " + cla.in() );

        Method m1 = null;
        try {
            m1 = cl.getMethod("run", null);
            MyAnno1 m1a = m1.getAnnotation(MyAnno1.class);
            System.out.println( "Annotation " + m1a.str() + " " + m1a.in() );

            Annotation[] m1as = m1.getAnnotations();
            for(Annotation a : m1as){
                System.out.println( "Annotations: " + a);
            }

        } catch (NoSuchMethodException e) {
           //
        }


        Field f = null;
        try {
            f = cl.getField("per3");
            MyAnno1 fa = f.getAnnotation(MyAnno1.class);
            System.out.println( "Annotation " + fa.str() + " " + fa.in() );
        } catch (NoSuchFieldException e) {
            //throw new RuntimeException(e);
        }


       Field[] fs =  cl.getFields();
       for(Field fd: fs){
           System.out.println( "Field:" + fd.getName());
       }
    }

    @MyAnno1(str = "var private")
    private String per1 = "";
    @MyAnno1(str = "var private static")
    private static String per2 = "";
    @MyAnno1(str = "var public")
    public String per3 = "";
    @MyAnno1(str = "var public static")
    public static String per4 = "";

    @Override
    public String toString() {
        return super.toString();
    }
}
