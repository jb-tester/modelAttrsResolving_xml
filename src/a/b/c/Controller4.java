package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller()
@SessionAttributes(value = "sessionAttr1", types = {Boo.class})
public class Controller4 {

    @RequestMapping("/c4/setup")
    public String setSessionAttrs(Model model){
        model.addAttribute("sessionAttr1","sessionAttribute1");
        model.addAttribute("booSessionAttr1",new Boo("booSessionAttr1"));
        model.addAttribute("booSessionAttr2",new Boo("booSessionAttr2"));

        return "redirect:/c4/view6";
    }
    @RequestMapping("/c4/view6")
    public String c3view5(
              @ModelAttribute("booSessionAttr1") Boo boo1
            , @ModelAttribute("booSessionAttr2") Boo boo2
            , @ModelAttribute("sessionAttr1") String s1)
    {

        return "view6";
    }
}

