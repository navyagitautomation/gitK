
@tag
Feature: To automate FB Login 
Scenario: To check all positive cases

Given user launches browser
And launch url
Then enters username and password
And clicks on login

@tag2

Scenario: To check  credentials with uppercase

Given user launches browser
And launch url
Then enters "NAVYA" and "66433"
And clicks on login
@tag2

Scenario: To check  credentials with set of different values

Given user launches browser
And launch url
Then enters "<username>" and "<password>"
And clicks on login

Examples:
|username|password|
|aaaa    |ab544   |
|bbbb    |bh675   |
|cccc    |k8888   |   