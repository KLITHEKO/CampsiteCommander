Introduction

This document presents the Campsite Commander README, a mobile application designed to input, process and display gear and food supplies and categorize them accordingly. 
The application is developed entirely on android studio with Kotlin using Arrays, if statements to implement application logic and XML for the user interface design.


Logo: 

<img width="500" height="500" alt="Untitled - 10 June 2026 at 08 52 15" src="https://github.com/user-attachments/assets/1e275f08-e371-4474-9599-0bd0cc8cc9bb" />
**********************************************************************************************************************************************************************************************************

**How It Works**

The user types their item name, category, quantity and comments into the input field and taps the  "add gear"button. 
The app reads the input, stores and the input into an array and uses loops and if statements to sort the data by quantity. 
The inventory is then displayed to a secondary screen using intents and provides a list with total quantity.
Once all data has been displayed a user is provided with a button to go back to Main screen.
The app uses, constraint, linear and scroll views in xml to ensure all views are contained.



<img width="385" height="712" alt="image" src="https://github.com/user-attachments/assets/e14dd0ee-3c7e-4342-845b-898d3e5f4c51" />

Inputing data
<img width="397" height="715" alt="image" src="https://github.com/user-attachments/assets/5f55795c-87ca-49c4-bc9b-37d4e97bc590" />


toast message for error handling if one of the fields is empty: 


<img width="394" height="491" alt="image" src="https://github.com/user-attachments/assets/2748b5dc-c0cb-4d11-89ff-3ac3ece9be8c" />



<img width="184" height="80" alt="image" src="https://github.com/user-attachments/assets/e7cba77a-ac14-4bb0-af41-dc15f87d1e78" />


View inventory can still be accessed even if the data in the arrays is empty: 

<img width="299" height="223" alt="image" src="https://github.com/user-attachments/assets/7e08d9e6-f8c2-48d5-8ba1-7dd284d75d22" />




**********************************************************************************************************************************************************************************************************

**Splash Screen**

The app launches with a minimalistic splash screen that displays just the application logo. 


**********************************************************************************************************************************************************************************************************


**Simple Android CI utilising Github actions**

This project uses GitHub Actions to automatically test and build the Android app whenever code is pushed or a pull request is opened on the main branch. 
It sets up Java 17, installs the Android SDK, runs unit tests, and builds the project — ensuring the code compiles and passes tests consistently (GitHub, 2023).






