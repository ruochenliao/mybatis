import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication(scanBasePackages={"com"})
public class Application {
    public static void main(String[] args){
        //springboot 启动配置
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }
}
