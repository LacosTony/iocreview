package be.technocite.IocReview;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocReviewApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(IocReviewApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
	}
}
