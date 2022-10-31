package com.inivos.pages.enums.topmenucomponent;

import org.assertj.core.util.diff.myers.Snake;

public enum SubMenuType {

    USERS ("Users"),
    USER_MANAGEMENT("User Management");

    private final String name;

    public String getName() {
        return name;
    }

    SubMenuType (String name){
        this.name = name;
    }

}
