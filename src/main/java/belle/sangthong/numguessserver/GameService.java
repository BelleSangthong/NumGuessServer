package belle.sangthong.numguessserver;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class GameService {

    private int randomNumber;

    public GameService() {
        this.randomNumber = generateRandomNumber();
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public String giveFeedback(int number) {
        if (number == randomNumber) {
            return "Correct!";
        } else if (number < randomNumber) {
            return "Too low!";
        } else {
            return "Too high!";
        }
    }
}
