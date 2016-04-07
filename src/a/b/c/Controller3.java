package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
@Controller("/c3")
public class Controller3 {
    @ModelAttribute("controller3ModelAttr")
    public String controller3ModelAttr(){
        return "controller3ModelAttr";
    }
}
