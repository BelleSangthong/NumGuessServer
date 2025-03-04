package belle.sangthong.numguessserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("/guessgame")
    String game() {
        return "guesspage";
    }

    @PostMapping("/guessgame")
    public String gamePost(Model model,
                           @RequestParam("guess") int guess) {
        String text = gameService.giveFeedback(guess);
        model.addAttribute("text", text);
        System.out.println("Random number is: " + gameService.getRandomNumber());
        return "guesspage";
    }

    @GetMapping("/randomnumber")
    String randomNumber(Model model) {
        gameService.generateRandomNumber();
        model.addAttribute("number", gameService.getRandomNumber());
        return "gamepage";
    }
}
