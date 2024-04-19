package de.netzkronehd.itplus.dockerextended;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "de.netzkronehd.itplus")
public class DockerExtendedApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerExtendedApplication.class, args);
    }

}
