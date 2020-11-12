/*
    Create an array to represent your shopping list with the following items: 'pop tarts', 'ramen noodles', 'chips', 'salsa', and 'coffee'.
    Add 'fruit loops' to the list.
    Update 'coffee' to 'fair trade coffee'
    Replace 'chips' and 'salsa' with 'rice' and 'beans'
    Create an empty array to represent your shopping cart.
    Remove the last item from your shopping list and add it to your cart
    Remove the first item from your shopping list and add it to the cart
    Write a 'while' loop that takes items from your shopping list and moves them to your cart until there are no items left on the list.
    Sort the items in your cart alphabetically... backwards
    Print the list of items in your shopping cart to the console as comma separated string.
 */
//Create the shopping list array
let shoppingList = ['pop tarts', 'ramen noodles', 'chips', 'salsa', 'coffee'];
//Add fruitloops
shoppingList.push('fruit loops');
//Update coffee
shoppingList[4]='fair trade coffee';
//replace chips and salsa (use splice) spice takes in atleast 2 parameters: index to start the splice, how many items to replace, and the things to replace those things with, which goes from item1...itemx
shoppingList.splice(2,2,'rice', 'beans');
//create an empty cart
let cart=[];
//remove the last item in the shopping list and add it to the cart;
cart.push(shoppingList.pop());
//remove the first iem
cart.push(shoppingList.shift());
//write a while loop to take items from shopping list and moves them to the cart
while(shoppingList.length!==0){
    cart.push(shoppingList.pop());
}
//Sort items alphabetically and backwards
cart.sort().reverse();
//Print the list of the items in the cart to the console
console.log(cart.join(', ')); //So why join instead of iterating through the array and outputting it? Well first the result is the same, but this is easier and this prints it out as one string rather than a variety of strings. Remember, you're not in school so there is no need to show that you understand the fundamentals like iterating through a loop. use what makes life more easier (like not having to show the sorting algorithms and reversing algorithms, just use sort and reverse lol)