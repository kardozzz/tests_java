package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupUpdateTests extends TestBase {


    @Test
    public void testGroupUpdateData() throws Exception {
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillGroupForm(new GroupDate("Update22222222222222", "Update2333333", "Update344444444444"));
        app.getGroupHelper().updateGroupData();
        app.getGroupHelper().returnToGroupPage();

    }
}





