package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
@Controller()
public class Controller3 {
    @ModelAttribute("controller3ModelAttr")
    public String controller3ModelAttr(){
        return "controller3ModelAttr";
    }
    @ModelAttribute() // ${numberList}
    public List<Number> implicitEmptyList(){
        return new ArrayList<>();
    }

    @ModelAttribute() // ${stringList}
    public List implicitList(){
        List list = new ArrayList<>();
        list.add("list element1");
        return list;
    }
    @RequestMapping("/c3/view5")
    public String c3view5(ModelMap model) {
        model.addAttribute("view5_attr1", "view5_attr1");
        Set attrs = model.keySet();
        System.out.println("========model attributes available in view5:");
        for (Object attr : attrs) {
            String modelAttr = (String) attr;
            System.out.println(modelAttr);
        }
        return "view5";
    }
}
