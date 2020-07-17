package jp.kobespiral.agiledev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JankenController {

  @GetMapping("/hello")
  // 該当すうIDから引っ張ってくる
  public String showUser(Model model) {
    return "hello";
  }
}
