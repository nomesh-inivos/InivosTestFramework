package com.inivos.pages;

import com.inivos.pages.enums.topmenucomponent.SubMenuType;
import com.inivos.pages.enums.topmenucomponent.MenuType;
import com.inivos.pages.pagecomponents.homepage.TopMenuComponent;
import com.inivos.util.PageActionsHelper;
import org.openqa.selenium.By;

public class HomePage {

    private TopMenuComponent  topMenuComponent;

    public HomePage() {
        this.topMenuComponent = new TopMenuComponent();
    }

    public TopMenuComponent getTopMenuComponent() {
        return topMenuComponent;
    }

    public TopMenuComponent navigateToAddUsersPage(){
        return topMenuComponent.clickMenuItem(MenuType.ADMIN).
                clickSubMenuItem(SubMenuType.USER_MANAGEMENT).
                clickSubMenuItem(SubMenuType.USERS);
    }
}
