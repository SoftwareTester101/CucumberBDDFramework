#Feature:   OpenSource LogIn Feature
#
#  Background: User navigates to OpenSource page
#    Given User on the OpenSource page on URL "https://s1.demo.opensourcecms.com/wordpress/wp-login.php"
#    Then user should see Login  message
#
#  Scenario Outline: Successful login to OpenSource with Examples keyword
#
#    When user fills in username with "<username>"
#    And user fills in password with "<password>"
#    And user clicks on the Login button
#    And user is on home page
#    Then user hoverovers New link
#    Then user clicks user link
#    Then user fills contact details "<user_login>" , "<email>"  and "<first_name>" , "<last_name>"
#    Then user presses Add New User Button
#    Then user hoverovers each link on the side bar
#    Then user closes the browser
#
#    Examples:
#
#      | username      | password      | user_login    | email                  | first_name | last_name |
#      | opensourcecms | opensourcecms | autogenerate1 | gina.bush101@gmail.com | Gina       | Bush      |
#      | opensourcecms | opensourcecms | autogenerate2 | gina.bush102@gmail.com | Tim        | Robinson  |
#      | opensourcecms | opensourcecms | autogenerate3 | gina.bush103@gmail.com | Tony       | Hogan     |
#      | opensourcecms | opensourcecms | autogenerate4 | gina.bush104@gmail.com | Tang       | Bruch     |
#
#
#
#
#
##
##    Scenario Outline: Failed login using wrong credentials
##      When user fills in email with "<email>"
##      And user fills in password with "<password>"
##      And user clicks on the Login button
##      And user should see warning message
##      Then user closes the browser
##
##
##
##
##      Examples:
##        | email                    | password     |
##        | gina.bush@gmail.com     | Freecrm1014@ |
##        | gina.bush101@gmail.com  | freecrm1014@ |
##        | gina.bush@gmail.com     |freecrm1014@  |
##        |                          |Freecrm1014@  |
##        | gina.bush@gmail.com     |               |
##
##
#
