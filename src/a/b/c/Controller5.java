package a.b.c;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/11/2016.
 * Project: modelAttrsResolving_xml
 * *******************************
 */
public class Controller5 implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        ModelMap myModel = new ModelMap();
        myModel.addAttribute("view8attr1","view8Attribute1");
        myModel.addAttribute("view8attr2","view8Attribute2");
        return new ModelAndView("view8",myModel);
    }
    @ModelAttribute("controller5Attr1")
    public String getNotannotatedControllerAttribute(){
        return "controller5Attribute1";
    }
}
