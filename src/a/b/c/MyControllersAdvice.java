package a.b.c;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
@ControllerAdvice()
public class MyControllersAdvice {
    @ModelAttribute
    public void globalAttributes(Model model) {
        model.addAttribute("globalModelAttr1", "globalModelAttr1");
    }

    @ModelAttribute("globalModelAttr2")
    public String globalModelAttr2(){
        return "globalModelAttr2";
    }
}
