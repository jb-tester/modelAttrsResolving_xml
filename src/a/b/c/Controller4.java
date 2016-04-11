package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Set;

@Controller()
@SessionAttributes(value = "sessionAttr1", types = {Boo.class})
public class Controller4 {

    @ModelAttribute("view7Attr")
    private String getView7Attr(){
        return "view7Attribute";
    }

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

    @RequestMapping("/c4/view7")
    public String view7(ModelMap model//, @ModelAttribute("view7Attr") String a
    ) {

        Set attrs = model.keySet();
        System.out.println("========model attributes available in view7:");
        for (Object attr : attrs) {
            String modelAttr = (String) attr;
            System.out.println(modelAttr);
        }
        return "view7";
    }

}

