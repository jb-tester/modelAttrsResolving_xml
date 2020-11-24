package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

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


    @ModelAttribute //  ${string}, ${fooList}
    public void implicitStringAndFooSet(Model model){
        Set<Foo> fooSet = new HashSet<Foo>();
        fooSet.add(new Foo("foo1",1));
        fooSet.add(new Foo("foo2",2));
        model.addAttribute(fooSet); //  ${fooList}
        model.addAttribute("controller2_implicitStringAttr"); // ${string}
    }

    @ModelAttribute // no attributes for empty lists!
    public void implicitEmptyList(Model model){
        List<Number> list = new ArrayList<>();
        //list.add(1);
        model.addAttribute(list);

    }
    @ModelAttribute // ${integerList}
    public void implicitAutodetectedTypeList(Model model){
        List list = new ArrayList<>();
        list.add(1);
        list.add("2");
        model.addAttribute(list);

    }

    @RequestMapping("/c2/view3")
    public String view1(ModelMap model) {
        model.addAttribute("view3_attr1", "view3_attr1");
        Set attrs = model.keySet();
        System.out.println("========model attributes available in view3:");
        for (Object attr : attrs) {
            String modelAttr = (String) attr;
            System.out.println(modelAttr);
        }
        return "view3";
    }

    @RequestMapping("/c2/view4")
    public String view2(ModelMap model) {
        model.addAttribute("view4_attr1", "view4_attr1");
        return "view4";
    }
}
