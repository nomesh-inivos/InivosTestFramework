package com.inivos.pages.pagecomponents.homepage;

import com.inivos.pages.enums.topmenucomponent.SubMenuType;
import com.inivos.pages.enums.topmenucomponent.MenuType;
import com.inivos.util.PageActionsHelper;
import org.openqa.selenium.By;

public class TopMenuComponent {
    private static final String MENU = "//b[text()='%s']/parent::a";  //"//b[text()='Admin']/parent::a";
    private static final String SUB_MENU = "//a[text()='%s']";


    public TopMenuComponent clickMenuItem(MenuType menuType) {
        String xpath = String.format(MENU, menuType.getName());
        PageActionsHelper.waitAndClick(By.xpath(xpath));
        return this;
    }

    public TopMenuComponent clickSubMenuItem(SubMenuType subMenuType) {
        String xpath = String.format(MENU, subMenuType.getName());
        PageActionsHelper.waitAndClick(By.xpath(xpath));
        return this;
    }
}
