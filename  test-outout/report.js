$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/contactsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Add new users Feature",
  "description": "",
  "id": "add-new-users-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User navigates to OpenSource page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User on the OpenSource page on URL \"https://s1.demo.opensourcecms.com/wordpress/wp-login.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user should see Login  message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://s1.demo.opensourcecms.com/wordpress/wp-login.php",
      "offset": 36
    }
  ],
  "location": "ContactsStepDefinition.user_on_the_OpenSource_page_on_URL(String)"
});
formatter.result({
  "duration": 6499729092,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_should_see_Login_message()"
});
formatter.result({
  "duration": 33741082,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User adds multiple contacts in the User scenario",
  "description": "",
  "id": "add-new-users-feature;user-adds-multiple-contacts-in-the-user-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user fills in username and password in the login page",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "opensourcecms",
        "opensourcecms"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user hoverovers New link",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks user link",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user fills user details",
  "rows": [
    {
      "cells": [
        "username",
        "email",
        "first_name",
        "last_name"
      ],
      "line": 18
    },
    {
      "cells": [
        "autogenerate1",
        "gina.bush101@gmail.com",
        "Gina",
        "Bush"
      ],
      "line": 19
    },
    {
      "cells": [
        "autogenerate2",
        "gina.bush102@gmail.com",
        "Tim",
        "Robinson"
      ],
      "line": 20
    },
    {
      "cells": [
        "autogenerate3",
        "gina.bush103@gmail.com",
        "Tony",
        "Hogan"
      ],
      "line": 21
    },
    {
      "cells": [
        "autogenerate4",
        "gina.bush104@gmail.com",
        "Tang",
        "Bruch"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user presses Add New User Button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user hoverovers each link on the side bar",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.user_fills_in_username_and_password_in_the_login_page(DataTable)"
});
formatter.result({
  "duration": 140941257,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_clicks_on_the_Login_button()"
});
formatter.result({
  "duration": 4290281672,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 12931074,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_clicks_New_button()"
});
formatter.result({
  "duration": 52810498,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_is_on_add_new_user_page()"
});
formatter.result({
  "duration": 6988228636,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_fills_contact_details_and(DataTable)"
});
formatter.result({
  "duration": 33332796145,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_presses_save_icon()"
});
formatter.result({
  "duration": 55314977,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_hoverovers_each_link_on_the_side_bar()"
});
formatter.result({
  "duration": 39332981,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "duration": 945953712,
  "status": "passed"
});
});