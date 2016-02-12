package behavioral.observer;

/**
 * Not possible to reuse Button, it is staticly binded with InputText and List
 */
public class Button {

    private InputText inputText;

    private List list;


    public void clicked() {

        list.setListValue(1);
        inputText.setText("button has been clicked");

    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }

    public void setList(List list) {
        this.list = list;
    }
}
