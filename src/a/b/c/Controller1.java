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
@RequestMapping("/c1")
public class Controller1 {

    @ModelAttribute("controller1ModelAttr")
    public String controller1ModelAttr(){
        return "controller1ModelAttr";
    }

    @ModelAttribute
    public String implicitString(){
        return "controller1_implicitStringAttr";
    }
    @ModelAttribute
    public void implicitStringList(Model model){
        List<String> list = new ArrayList<>();
        list.add("controller1_implicitStringListAttr");
        model.addAttribute(list);
    }
    @ModelAttribute // ${fooList}
    public void implicitFooArray(Model model){
        Foo[] fooArray = {new Foo("foo1",1), new Foo("foo2",2)};
        model.addAttribute(fooArray);
    }


    @RequestMapping("/view1")
    public String view1(ModelMap model) {
        model.addAttribute("view1_attr1", "view1_attr1");
        return "view1";
    }

    @RequestMapping("/view2")
    public String view2(ModelMap model) {
        model.addAttribute("view2_attr1", "view2_attr1");
        return "view2";
    }
}
