# Learning Java from

## Challenges List 

### Here you you can find some examples of the challanges I approached during this Learning process 

1. ### Positive, Negative, Zero<br>
  **Description:** <br>
  <br>
      Write a method called checkNumber with an int parameter number.<br>
      The method should not return any value, and it needs to print out:<br>
      "positive" if the parameter number is > 0<br>
      "negative" if the parameter number is < 0<br>
      "zero" if the parameter number is equal to 0<br>

2. ### **Speed Converter**<br>
  **Description:** <br>
  <br>
      . Write a method called toMilesPerHour that has 1 parameter of type double with<br> 
      the name kilometersPerHour. This method needs to return the rounded value of the<br>
      calculation of type long. If the parameter kilometersPerHour is less than 0, the<br> 
      method toMilesPerHour needs<br>
      to return -1 to indicate an invalid value.Otherwise, if it is positive, calculate<br> 
      the value of miles per hour, round it and return it. For conversion and rounding,<br>
      check the notes in the text below.<br>
      . Write another method called printConversion with 1 parameter of type double with the name<br>
      kilometersPerHour. This method should not return anything (void) and it needs to calculate<br>
      milesPerHour from the kilometersPerHour parameter.<br>
      Then it needs to print a message in the format "XX km/h = YY mi/h".<br>
      XX represents the original value kilometersPerHour.<br>
      YY represents the rounded milesPerHour from the kilometersPerHour parameter.<br>
      If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".<br>
      <br>
      **How to use the method round and how it works?**
      <br>
      The Math.round() is a built-in math method which returns the closest long to the argument.<br> The result is rounded to an integer by adding 1/2,       taking the floor of the result after adding 1/2,<br>and typecasting the result to type long. The method returns the value of the argument rounded       to<br> the nearest int value.<br>

3. ### **Barking Dog**<br>
**Description:** <br>
<br>
      We have a dog that likes to bark.  We need to wake up if the dog is barking at night!<br>
      Write a method shouldWakeUp that has 2 parameters.<br>
      1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.<br>
      2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.<br>
      We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.<br>
      In all other cases return false.<br>
      If the hourOfDay parameter is less than 0 or greater than 23 return false.<br>
      Examples of input/output:<br>
      shouldWakeUp (true, 1); → should return true<br>
      shouldWakeUp (false, 2); → should return false since the dog is not barking.<br>
      shouldWakeUp (true, 8); → should return false, since it's not before 8.<br>
      shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.<br>
      
4. ### **Leap Year**<br>
**Description:** <br>
<br>
      Write a method isLeapYear with a parameter of type int named year.<br>
      The parameter needs to be greater than or equal to 1 and less than or equal to 9999.<br>
      If the parameter is not in that range return false.<br>
      Otherwise, if it is in the valid range, calculate if the year is a leap year and return <br>
      true if it is a leap year, otherwise return false.<br>
      To determine whether a year is a leap year, follow these steps: <br>
      1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.<br>
      2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.<br>
      3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.<br>
      4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.<br>
      5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.<br>
 5. ### **Decimal Comparator**<br>
**Description:** <br>
<br>
     Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
     The method should return boolean and it needs to return true if two double numbers 
     are the same up to three decimal places. Otherwise, return false
  

      
      
   


