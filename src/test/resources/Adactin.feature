Feature: Validation of adactin hotel
Scenario Outline: Validation of Adactin hotel by giving userid and password
Given user launches the adactin hotel url
When user enters the "<username>" and "<password>"
And user click on the login button
And user select the "<location>" and"<Hotels>" and "<Room type>"and"<Number of rooms>"and "<adults per room>"and "<children per room>"
And user click on the search and continue button
And user enters the "<first name>" and "<lastname>"and"<address>"and"<creditcardno>"
And user select the "<creditcardtype>" and "<expery month>" and"<expery year>"
And user enters the"<cvv no>"
And user click on book now
Then user validates the title of the webpage

Examples:
 
 |username         |password     |location|Hotels      |Room type|Number of rooms|adults per room|children per room|first name|lastname|address|creditcardno    |creditcardtype|expery month|expery year|cvv no|
 |RAJASEKAR1       |QD79V8       |Sydney  |Hotel Hervey|Deluxe   |1              |1              |1                |RAJA      |SEKAR   |TRICHY |6543876543298765|AMEX          | 12					|2021				|453	 |      