package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/6/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
@Controller()
@SessionAttributes(names = {"sessionAttr1","sessionAttr2","sessionAttr3","foo"}, types = {Boo.class})
public class Controller3 {
    @ModelAttribute("controller3ModelAttr")
    public String controller3ModelAttr(){
        return "controller3ModelAttr";
    }
    @ModelAttribute() // ${numberList}
    public List<Number> implicitEmptyList(){
        return new ArrayList<>();
    }

    @ModelAttribute() // ${dateList}
    public List implicitList(){
        List list = new ArrayList<>();
        list.add(new Date());
        return list;
    }

    /**
     * set session and flash attributes
     * @param model - model to set session attrs to
     * @param redirectAttributes - to add flash attributes to
     * @return navigates to real view
     */
    @RequestMapping("/c3/setup")
    public String setSessionAndFlashAttrs(Model model, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("flashAttr", new Bar("from flash"));
        model.addAttribute("sessionAttr1","sessionAttribute1");
        model.addAttribute("sessionAttr2","sessionAttribute2");
        model.addAttribute("sessionAttr3","sessionAttribute3");
        model.addAttribute("booSessionAttr1",new Boo("booSessionAttr1"));
        model.addAttribute("booSessionAttr2",new Boo("booSessionAttr2"));

        model.addAttribute("boo", new Boo("boo!"));
        model.addAttribute("foo", new Foo("foo!",1));

        return "redirect:/c3/view5";
    }

    /**
     * all session and flash attributes set in the setSessionAndFlashAttrs() method should be available in view, both passed as
     * ModelAttribute-annotated parameter and not passed.
     * @param booAttr - test implicit session attribute name recognizing from parameter type; session attribute should be set!
     * @param booSessionAttr1 - named parameter; corresponds to set session attribute
     * @param s2 - named parameter; corresponds to set session attribute
     * @param fooAttr test implicit session attribute name recognizing from parameter type; session attribute should be set!
     * @return view name
     */
    @RequestMapping("/c3/view5")
    public String c3view5(ModelMap model //, @ModelAttribute("flashAttr") Bar bar
                                         , @ModelAttribute Boo booAttr    // ${boo}; org.springframework.validation.BindingResult.boo is created
                                         , @ModelAttribute("booSessionAttr1") Boo booSessionAttr1
                                         //, @ModelAttribute("sessionAttr1") String s1
                                         , @ModelAttribute("sessionAttr2") String s2
                                         , @ModelAttribute Foo fooAttr // ${foo}; org.springframework.validation.BindingResult.foo is created
    ){
        model.addAttribute("view5_attr1", "view5_attr1");

        System.out.println("====check session attributes implicitly mapped to parameters:");
        System.out.println(model.get("boo").equals(booAttr));
        System.out.println(model.get("org.springframework.validation.BindingResult.boo").equals(booAttr));
        System.out.println(model.get("foo").equals(fooAttr));
        System.out.println(model.get("org.springframework.validation.BindingResult.foo").equals(fooAttr));
        booAttr.setBooStr(booAttr.getBooStr()+"_modified");
        fooAttr.setFooStr(fooAttr.getFooStr()+"_modified");
        Set attrs = model.keySet();
        System.out.println("========model attributes available in view5:");
        for (Object attr : attrs) {
            String modelAttr = (String) attr;
            System.out.println(modelAttr);
        }
        return "view5";
    }
}
