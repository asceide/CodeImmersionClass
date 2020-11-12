/*
    Create a variable billAmount and store a random number (ie: 100)
    Create a function gratuity()
        gratutity should multiply the value of billAmount by 20% (hint: use 0.2) and return the value
    Create a function totalWithGrat()
        totalWithGrat should take in the amount as an argument, call the gratutity function, add the returned value to the original bill amount, and return the total bill + gratuity
    Append the return value of totalWithGrat to the following phrase: "Your total including gratuity is:" and log it to the console
    Only invoke the totalWithGrat function when logging the result
    Bonus: Find a way to fix the decimal point to only 2 places (ie: 120.00)
 */

let billAmount=89;
function gratuity(amount){
    return amount*.2;
}
function totalWithGrat(amount){
    return gratuity(billAmount)+billAmount;
}
console.log(`Your total including gratuity is: $${totalWithGrat(billAmount).toFixed(2)}`);