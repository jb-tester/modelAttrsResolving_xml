package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/11/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
@Controller
public class SuperController {

    @ModelAttribute("superAttr1")
    public String getSuperAttr1(){
        return "superAttribute1";
    }
}
