package jp.kobespiral.agiledev.service;

import java.util.Random;
import org.springframework.stereotype.Service;

import jp.kobespiral.agiledev.form.HandForm;
import jp.kobespiral.agiledev.form.VsComputerForm;

@Service
public class JankenService {

  public VsComputerForm vsComputer(HandForm handform) {
    VsComputerForm vsComputerForm = new VsComputerForm();

    int userHand = handform.getHand();
    Random r = new Random();
    int comHand = r.nextInt(3) + 1;
    int d = userHand - comHand;
    String result;
    if (d == -1 || d == 2) {
      result = "あなたの勝ち！";
    } else if (d == -2 || d == 1) {
      result = "あなたの負け！";
    } else {
      result = "引き分け！";
    }

    vsComputerForm.setUserHand(HandConvert(userHand));
    vsComputerForm.setComputerHand(HandConvert(comHand));
    vsComputerForm.setResultText(result);
    return vsComputerForm;
  }

  public String HandConvert(int hand) {
    String stringHand;
    if (hand == 1) {
      stringHand = "グー";
    } else if (hand == 2) {
      stringHand = "チョキ";
    } else {
      stringHand = "パー";
    }
    return stringHand;
  }

  public int RandComputer() {
    Random r = new Random();
    return r.nextInt(3);
  }

}
