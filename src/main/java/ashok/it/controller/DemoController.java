package ashok.it.controller;

public class DemoController {
  
  @GetMapping("/get")
  public String getMethod()
  {
    return "Get Method Working";
  }

}
