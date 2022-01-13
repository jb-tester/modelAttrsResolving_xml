package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * *
 * <p>Created by irina on 1/13/2022.</p>
 * <p>Project: modelAttrsResolving_xml</p>
 * *
 */
@Controller
@RequestMapping("/c7")
public class Controller7 {

    @RequestMapping("/test1")
    public String test1(ModelMap model) {
        model.addAttribute("c7test1_attr1", "c7test1_attr1");
        Collection<Foo> attrs_list = new ArrayList<>(Arrays.asList(new Foo("foo1", 1), new Foo("foo2", 2), new Foo("foo3", 3)));
        model.addAllAttributes(attrs_list);
        Map<String, String> attrsMap  = new HashMap<>();
        attrsMap.put("map1attr1", "map1attr1_value");
        attrsMap.put("map1attr2", "map1attr2_value");
        attrsMap.put("map1attr3", "map1attr3_value");
        model.addAllAttributes(attrsMap);
        model.addAllAttributes(Map.of(
                "map2attr1", "map2attr1_value",
                "map2attr2", "map2attr2_value",
                "map2attr3", "map2attr3_value"
        ));
        return "view7test1";
    }

    @RequestMapping(value = "/test2")
    public ModelAndView test2() {

        ModelAndView mav = new ModelAndView("view72");
        mav.addObject("test2_name", "test2_value");
        return mav;
    }
}
