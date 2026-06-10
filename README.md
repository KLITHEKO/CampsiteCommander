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


**app theme:**

**Visual look design**

The users are then presented with a simple and intuitive UI for the campsite commander app that
uses an artisan sage and clay  inspired colour palette, characterised by earthy tones that are aligned with flat material design principles. Subtle borders and soft shadows are used to create a clean and modern aesthetic.

colors can be found in the colors.xml





<img width="385" height="712" alt="image" src="https://github.com/user-attachments/assets/e14dd0ee-3c7e-4342-845b-898d3e5f4c51" />







**Inputing data**




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
It sets up Java 17, installs the Android SDK, runs unit tests, and builds the project — ensuring the code compiles and passes tests consistently.



**********************************************************************************************************************************************************************************************************


How to guide




1. Enter Items (One by one) as per the input fields

   <img width="292" height="249" alt="image" src="https://github.com/user-attachments/assets/793e0fea-cb28-494a-9c11-4121d8c49cbd" />



2. once satisfied with data input click add gear button:




<img width="300" height="353" alt="image" src="https://github.com/user-attachments/assets/2b8d1e65-b715-48c2-84d9-f8d1e56966f0" />





a toast message will let you know that the data was inputed accordingly and you can add another item:





<img width="172" height="46" alt="image" src="https://github.com/user-attachments/assets/18e77b27-21a4-43d2-8310-4d45be8ed70f" />







3. Once satisfied with click on the view inventory button and a detailed inventory list with total inventory and items packed will be shown accordingly with a back to base button



   <img width="282" height="510" alt="image" src="https://github.com/user-attachments/assets/9cd847bb-1311-4d80-bf90-71144e9f03ac" />



Back to base sends you to the main screen where you can add additional items


<img width="300" height="562" alt="image" src="https://github.com/user-attachments/assets/3f67e58d-7dd3-4e64-8c81-ada47d913a8c" />



4. Once user is done, you can exit the app. 












