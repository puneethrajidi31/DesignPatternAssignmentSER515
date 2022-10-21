# DesignPatternAssignmentSER515


Implemented design patterns and relevant methods in this order

Prerequisites:

Add relevant text data files which includes sample credentials, menu options and user choices

Step1: Login

-> Ask whether user is Buyer or seller
 User Input Option: int(datatype)
  0 for Buyer
  1 for Seller
-> Ask for user name and password from user
-> Check the credentials either in seller list or in buyer list based on previous input
-> If found, Authentication successful and will proceed to step2 or else print the relevant result i.e Invalid data type or Invalid credentials
-> Used facade design pattern to implement step1

Step2: Print Menu

-> Ask the user to pick meat menu or produce menu
   0 for Meat
   1 for Produce
-> Based on the input, call the relevant function. Implemented factory design pattern here
-> On successful call to relevant function, display the menu. Implemented bridge design pattern.

Step3: Print user choices

-> Using Iterator design pattern, print all the user choices.

Step4: Print Bid value

-> Ask the user to order a dish
-> Based on the given dish, we print the users and count of users related to that particular dish
-> Implemented visitor design pattern here.
