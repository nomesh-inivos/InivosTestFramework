package com.inivos.pages;

import com.inivos.pages.pagecomponents.addUsersPage.AddUserComponent;
import com.inivos.pages.pagecomponents.addUsersPage.SearchComponent;
import lombok.Data;

@Data
public class AddUsersPage {
    private SearchComponent searchComponent;
    private AddUserComponent addUserComponent;
}
