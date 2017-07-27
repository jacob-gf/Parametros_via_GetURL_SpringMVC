
package com.jacob.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jacobh
 */
@Controller
public class HomeController {
    
    @RequestMapping("home.html")
    public ModelAndView home (HttpServletRequest request){
        
        ModelAndView map= new ModelAndView ();
        map.setViewName("home/home");
        
        String  id = request.getParameter("id");
        String  id2 = request.getParameter("id2");
        
        map.addObject("id", id);
        map.addObject("id2", id2);
        return map;
    }
    
    @RequestMapping("nosotros.html")
    public ModelAndView nosotros (){
        
        ModelAndView map= new ModelAndView();
        map.setViewName("home/nosotros");
        return map;
    }
    
}
