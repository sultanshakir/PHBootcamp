package app;

import java.util.ArrayList;
import java.util.List;

public class OptionsBuilder<T> {
  private List<String> titles = new ArrayList<>();
  private List<T> options = new ArrayList<>();

  public void addOption(String title, T action) {
    titles.add(title);
    options.add(action);
  }
  public void build(Action<T> action) {
    for (int i = 0; i < titles.size(); i++) {
      String title = titles.get(i);
      String currentNumber = Integer.toString(i + 1);
      String text = "["+ currentNumber +"]" + title;
      Printer.println(text);
    }
    Prompter.prompt("", (text) -> {
      int selectedOptionText = Integer.parseInt(text);
      T selectionOption = options.get(selectedOptionText - 1);
      action.execute(selectionOption);
    });
  }
}
