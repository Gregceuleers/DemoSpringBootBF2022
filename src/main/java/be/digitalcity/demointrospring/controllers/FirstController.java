package be.digitalcity.demointrospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class FirstController {

    List<String> infos = Arrays.asList(
            "Toto",
            "Tutu",
            "TaTa"
    );

    @RequestMapping(path = "/first", method = RequestMethod.GET)
    public ModelAndView firstCall() {
        ModelAndView mv = new ModelAndView("first");

        String msg = "SpringBoot";
        mv.addObject("message", msg);
        mv.addObject("infos", infos);

        return mv;
    }

}
