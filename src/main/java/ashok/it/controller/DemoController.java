package ashok.it.controller;


@restController
public class DemoController {
  
  @GetMapping("/get")
  public String getMethod()
  {
    return "Get Method Working";
  }

}
