package jp.kobespiral.agiledev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.kobespiral.agiledev.form.HandForm;
import jp.kobespiral.agiledev.form.VsComputerForm;
import jp.kobespiral.agiledev.service.JankenService;

@Controller
public class JankenController {
  @Autowired
  JankenService jankenService;

  @GetMapping("/hello")
  // 該当すうIDから引っ張ってくる
  public String showUser(Model model) {
    return "hello";
  }

  @PostMapping("/vscomputer/result")
  public String vsComputerResult(HandForm handform, Model model) {
    VsComputerForm vsComputerForm = jankenService.vsComputer(handform);
    model.addAttribute("VsComputerForm", vsComputerForm);
    return "vscomputerresult";
  }

}
