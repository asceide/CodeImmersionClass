/*
    Challenge 2 from the slides

    Create a variable for the temperature and set it to 80
    Write a statement that outputs the temperature as "The temperature is 80 degrees."
    If the temp is greater than 80, output "time to swim" (set temp to 60, 90) and test.
    Create a precipitation variable and set it to false.
    Only output "time to swim" if temp is greater than 80 and it's not raining.
    Set the precipitation variable to "raining" or "snowing" and only output "time to swim" if there is no precipitation.
    Create an "indoors" variable and set it to true.
    If indoors, then output "time to swim" regardless of the temp and precipitation.

 */

let temperature = 99;
let precipitation=false;
let precipType='rain'
let indoors=true;
console.log("The temperature is " + temperature + " degrees.")
if(precipType!=='none'){ //Not equals evaluation is !==. We don't have to use an .equals to compare strings like in Java, or strcmp in C.
    precipitation=true; //Since this is just an intro challenge, this is ~okay~, but this kind of assignment is real MEH. Gotta check against an array of types.
}
if((temperature>80 && precipitation===false) || indoors===true){
    console.log("Time to swim.");
}

