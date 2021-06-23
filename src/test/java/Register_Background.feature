Feature: Register Test

  Background:
    Given Navigate to Website
    And click Sign in button
    And type email "emrekrdenz@gmail.com"
    And click on Create an Account button

    Scenario: Kisi 1
      And type firstname "emre" and lastname "karadeniz"
      And type password "emre123"

      Scenario: Kisi 2
        And type Company "testinium"
        And type address "Yenisahra"

        Scenario Outline: Kisi 3

          And type firstname "<isim>" and lastname "<soyisim>"
          And type password "<sifre>"
          And type Company "<sirket>"
          And type address "<adres>"
          Examples:
          |isim|soyisim|sifre|sirket|adres|
          |emre|karadeniz|emre34|testinium|atasehir|
          |omer|karadeniz|omer36|dell|kars|
