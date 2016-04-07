package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
@Controller
//@RequestMapping("/")
public class Controller2 {

    @ModelAttribute("controller2ModelAttr")  // ${controller2ModelAttr}
    public String controller2ModelAttr(){
        return "controller2ModelAttr";
    }
    @ModelAttribute  // ${stringList}
    public List<String> implicitString(){
        List<String> list = new ArrayList<>();
        list.add("controller2_implicitStringListAttr");
        return list;
    }
    @ModelAttribute  // ${string}
    public void implicitString(Model model){
        model.addAttribute("controller2_implicitStringAttr");
    }

    @RequestMapping("/c2/view3")
    public String view1(ModelMap model) {
        model.addAttribute("view3_attr1", "view3_attr1");
        return "view3";
    }

    @RequestMapping("/c2/view4")
    public String view2(ModelMap model) {
        model.addAttribute("view4_attr1", "view4_attr1");
        return "view4";
    }
}
