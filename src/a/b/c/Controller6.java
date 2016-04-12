package a.b.c;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/11/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
public class Controller6 extends AbstractController {

    @ModelAttribute("controller6Attr1")
    public String getNotannotatedControllerAttribute(){
        return "controller6Attribute1";
    }

    public ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView("view9","view9attr1","view9Attribute1");
        modelAndView.addObject("view9attr2","view9Attribute2");
        return modelAndView;
    }


}
