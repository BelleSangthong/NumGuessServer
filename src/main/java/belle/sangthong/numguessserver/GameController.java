package belle.sangthong.numguessserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("/guessnumber")
    public String guessNumber(Model model) {
        int number = gameService.getNumber();
        model.addAttribute("number", number);
        return "gamepage";
    }
}
