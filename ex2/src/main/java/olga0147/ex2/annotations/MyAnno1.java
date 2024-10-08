package olga0147.ex2.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//CLASS (по умолчанию стоит) - сохраняются в .class, но не доступные в рантайме JVM-у
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@ interface MyAnno1 {
    String str();
    int in() default 0;
}
