package jp.kobespiral.agiledev.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VsComputerForm {
  private String userHand;
  private String computerHand; 
  private String resultText;
}
