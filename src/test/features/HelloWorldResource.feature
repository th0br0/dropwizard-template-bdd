@helloWorld
Feature: Hello World Resource

  @helloWorldSay
  Scenario: Say "hello world"!
    When I say hello
    Then I expect a response of "hey there! "

    When I say hello, I'm john
    Then I expect a response of "hey there! john"
