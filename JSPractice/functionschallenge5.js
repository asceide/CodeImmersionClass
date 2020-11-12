/*
    Create an Array named superHeroes shown above
    Create a secretIdentity variable
    Assign superHeroes.map() to the secretIdentity variable
    Assign an anonymous function to superheroes.map() as an argument
    Your anonymous function should have one parameter named revealArray
    Inside the block of your anonymous function:
        You'll be working with revealArray as an argument
        Using revealArray, return a string that will join the two array items.
        join them together with the string "is" (ie: "Batman is Bruce Wayne")
    Log the results to the screen and join them with a line break.
 */
let superHeroes=[
    ["Batman", "Bruce Wayne"],
    ["Spiderman", "Peter Parker"],
    ["The Flash", "Barry Allen"]
];

let superIdentity=superHeroes.map((hero)=>{//Anonymouse function with a parameter 'hero', which contains an array of strings
    //return `${hero[0]} is ${hero[1]}` //String at position 0 is the hero name and string at position 1 is their real name
    return hero.join(' is '); //Easier way to accomplish the above. Remember to use join more often!
});

console.log(superIdentity.join('\n')); //Joining the string array with a linebreak