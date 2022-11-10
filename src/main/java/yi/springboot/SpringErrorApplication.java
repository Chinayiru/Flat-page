package yi.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yi.springboot.mapper")
public class SpringErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringErrorApplication.class, args);
    }

}
