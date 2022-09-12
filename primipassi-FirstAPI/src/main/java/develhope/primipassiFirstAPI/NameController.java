package develhope.primipassiFirstAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String myname(){
        return "Mario";
    }

    @GetMapping("/namereverse")
    public String mynamereverse(@RequestParam String name){
        StringBuilder nameReversed = new StringBuilder();
        nameReversed.append(name);
        nameReversed.reverse();
        return nameReversed.toString();
    }


}
