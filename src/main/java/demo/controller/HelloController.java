package demo.controller;

import demo.controller.model.Hoge;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

  /*
  @RequestMapping(method=RequestMethod.GET)
  public String getMethod() {
    return "get";
  }

  @RequestMapping(method=RequestMethod.POST)
  public String postMethod1() {
    return "post";
  }

  @RequestMapping(value="/hey", method=RequestMethod.POST)
  public String postMethod2() {
    return "hey post";
  }
  */

  /*
  @RequestMapping(method=RequestMethod.GET)
  public String hello() {
    return "hello";
  }
  */

  @RequestMapping(method=RequestMethod.GET)
  public String hello(Model model) {
    Hoge hoge = new Hoge();
    hoge.id = 10;
    hoge.value = "hoge";

    model.addAttribute("myData", hoge);

    return "hello";
  }
}
