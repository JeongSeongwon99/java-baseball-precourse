import controller.GameController;
import service.GameService;
import view.InputView;
import view.OutputView;
import service.RandomNumberGenerator;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        GameService gameService = new GameService(
                new RandomNumberGenerator()
        );

        new GameController(inputView, outputView, gameService).run();
    }
}
