package lk.ijse.main;

import model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
         ctx.refresh();
        StudentController studentController=ctx.getBean(StudentController.class);
         studentController.save_user_grou();



    }

}
