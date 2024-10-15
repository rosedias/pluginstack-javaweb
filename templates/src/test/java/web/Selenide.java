package web;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class Selenide {

  @Test
	@DisplayName("Deve exibir a Home")
	void viewHome() {

		open("https://google.com");

	}
}

