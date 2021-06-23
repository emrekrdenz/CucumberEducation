Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type email "<Email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<Company>"
    And type address "<address>"

    Examples:
      | Email | firstname | lastname | password | Company | address |

    |emrekrdenz@gmail.com|emre|karadeniz|emre366|testinium|atasehir|
    |omerkrdenz@gmail.com|omer|karadeniz|omer123|insider|yenisahra|
    |ahmetugur@gmail.com|ahmet|ugur|ahmet12|monster|kadiköy|

