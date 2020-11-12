/*
Challenge 2
    Define a hands array with the values 'rock', 'paper', and 'scissors'
    Define a function getComputerHand() that returns a hand from the array using parseInt(Math.random()*10) % 3)
    Define a function called compare() that
        Takes two choices as arguments
        Determines the winner
        Logs the hands played by each
        Returns a string indicating the result
    Play a game
 */

let hands = ['rock', 'paper', 'scissors'];

function getComputerHand(){
    return hands[parseInt(Math.random()*10) % 3]
}

function compare(choice1, choice2){
    console.log("Player1: " + choice1);
    console.log("Player2: " + choice2);

    if (choice1 == choice2){
        return "Tie!";
    }
    if (choice1 == "rock"){
        if (choice2 == "paper"){
            return "Player2 Won!";
        }
        else{
            return "Player1 Won!";
        }
    }
    else if (choice1 == "paper"){
        if (choice2 == "scissors"){
            return "Player2 Won!";
        }
        else{
            return "Player1 Won!";
        }
    }
    else if (choice1 == "scissors"){
        if (choice2 == "rock"){
            return "Player2 Won!"
        }
        else{
            return "Player1 Won!"
        }
    }
}

let choice1 = getComputerHand(); // computer's choice
let choice2 = hands[2]; // our choice
let game_result = compare(choice1, choice2); // get the result

console.log(game_result); // log the result