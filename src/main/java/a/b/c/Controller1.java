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
@RequestMapping("/c1")
public class Controller1 {

    @ModelAttribute("controller1ModelAttr1")
    public String controller1ModelAttr1(){
        return "controller1ModelAttr1";
    }
    @ModelAttribute("controller1ModelAttr2")
    public String controller1ModelAttr2(Model model){
        model.addAttribute("controller1ModelAttr2_extra","model attr, added to model in @ModelAttribute-annotated method" );
        return "controller1ModelAttr2";
    }
    @ModelAttribute
    public void controller1ModelAttr3(Model model){
        model.addAttribute("controller1ModelAttr3_extra","model attr, added to model in @ModelAttribute-annotated method that returns void" );
       
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
    @ModelAttribute // ${hashMap}
    public void implicitMap(Model model){
        Map<String,Foo> myMap = new HashMap<>();
        myMap.put("foo1", new Foo("foo1",1));
        model.addAttribute(myMap);
    }
    @ModelAttribute // ${linkedHashMap}
    public void implicitMap2(Model model){
        Map<String,String> myMap = new LinkedHashMap<>();
        myMap.put("mapkey1","mapvalue1" );
        model.addAttribute(myMap);
    }
    @RequestMapping("/view1")
    public String view1(ModelMap model) {
        model.addAttribute("view1_attr1", "view1_attr1");
        Set attrs = model.keySet();
        System.out.println("====model attributes available in view1:");
        for (Object attr : attrs) {
            String modelAttr = (String) attr;
            System.out.println(modelAttr);
        }
        return "view1";
    }

    @RequestMapping("/view2")
    public String view2(ModelMap model) {
        model.addAttribute("view2_attr1", "view2_attr1");
        return "view2";
    }
}
