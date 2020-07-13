package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by DW 07/13/20
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
