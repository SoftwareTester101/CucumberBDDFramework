Feature:   Add new users Feature

  Background: User navigates to OpenSource page
    Given User on the OpenSource page on URL "https://s1.demo.opensourcecms.com/wordpress/wp-login.php"
    Then user should see Login  message

  Scenario: User adds multiple contacts in the User scenario

    When user fills in username and password in the login page
      | username      | password      |
      | opensourcecms | opensourcecms |

    And user clicks on the Login button
    And user is on home page
    Then user hoverovers New link
    Then user clicks user link
    Then user fills user details
      | username      | email                  | first_name | last_name |
      | autogenerate1 | gina.bush101@gmail.com | Gina       | Bush      |
      | autogenerate2 | gina.bush102@gmail.com | Tim        | Robinson  |
      | autogenerate3 | gina.bush103@gmail.com | Tony       | Hogan     |
      | autogenerate4 | gina.bush104@gmail.com | Tang       | Bruch     |

    Then user presses Add New User Button
    Then user hoverovers each link on the side bar
    Then user closes the browser







