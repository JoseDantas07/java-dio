package dio.project_board;

import dio.project_board.UI.MenuUi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectBoardApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBoardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MenuUi menuUi = new MenuUi();
		menuUi.menu();
	}
}
