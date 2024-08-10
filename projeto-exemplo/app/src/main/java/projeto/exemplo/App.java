package projeto.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
@RequestMapping("/app")
public class App {

    @GetMapping
    public String olaMundo() {
        return "Olá, mundo!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}