package org.no.page.element.container;

import org.no.page.element.CalcButton;
import org.no.page.element.MainLabel;
import org.no.page.element.abstraction.AbstractElement;
import org.no.page.element.iface.Element;
import org.openqa.selenium.support.FindBy;

public class Calculator extends AbstractElement implements Element {
    @FindBy(css = "span.sciop:nth-child(2)")
    private CalcButton rnd;

    @FindBy(css = "#sciOutPut")
    private MainLabel output;

    public void rnd() {
        rnd.click();
    }

    public String getResult() {
        return output.text();
    }
}
