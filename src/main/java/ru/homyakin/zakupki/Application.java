package ru.homyakin.zakupki;

import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.homyakin.zakupki.web.FTPClient223fz;
import ru.homyakin.zakupki.web.exceptions.NetworkException;

@SpringBootApplication
@EnableScheduling
class StartApp implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    private FTPClient223fz ftp;

    public StartApp(FTPClient223fz ftp) {
        this.ftp = ftp;
    }

    @Override
    public void run(String... args) {
        try {

            List<String> folders = ftp.getAllParsingFolders();
            System.out.println("0: Start");
            for (int i = 0; i < folders.size(); ++i) {
                System.out.println(i + 1 + " " + folders.get(i));
            }
            int folder = -1;
            Scanner sc = new Scanner(System.in);
            while (folder != 0) {
                folder = sc.nextInt();
                if (folder < 1 || folder > folders.size()) {
                    continue;
                }
                ftp.addParsingFolder(folders.get(folder - 1));
            }
            ftp.connect();
            ftp.login();
            ftp.parseFTPServer();
        } catch (NetworkException e) {
            logger.error("Network error: {}", e.getMessage(), e);
        } catch (Exception e) {
            logger.error("Internal error", e);
        }
    }
}

public class Application {
    //TODO add Spring
    //TODO add reconnecting to server if something went wrong
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
