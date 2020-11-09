/*
    So here is the thing, there are different implementations in reading user input depending on whether you're working on the front-end (for example using a browser to execute the .js
    ) or backend, using for example node.js. I will be showing both kinds, however I will be commenting out the node.js implementation
 */


//Browser - remember to add a index.html file and on it, add
//<script type="text/javascript" src="path/to/file.js"></script> in the head tag
let cupsConsumed=prompt("How many cups have you drunk? ");

if(cupsConsumed<3){
    //console.log("Yes I'll take another cup of coffee"); //I can be using console output but I'm lazy to bring it up -\(シ）/-
    alert("Yes I'll take another cup of coffee");
}else{
    //console.log("I think I'm okay for now. ");
    alert("I think I'm okay for now. ");
}



//NodeJS

//There are several ways to go about reading line using nodeJS, but first lets just use readLine

//When you're importing modules with nodeJS, you have to use the following syntax:
//(const/var/let) (name) = require('(module_name)');
//If you want to create your own module and use it in other .js files, use the exports keywords, as in
//exports.myDateTime = function(){
//      return Date();
//};

//and then use the filepath with require.
//Anyways, using readline
/*
const readline = require('readline');//We are going to use readline in node for this, so import that module

const rl = readline.createInterface({ //We need to create an interface to read the line with two elements: input and output
    input: process.stdin, //Gets the stdinput of the process
    output: process.stdout //Outputs the stdout of the process
});
function moreCups() {
  /*  rl.question('How many cups of coffee have you drunk? ', (answer)=>{ //Output a prompt/question to the console and listen for the user input
       let cupsConsumed=parseInt(answer); //Parse the userinput to an int
       if (cupsConsumed < 3) { //If its less than 3
           console.log("I think I will have another one!");
       } else { //Greater
           console.log("I think I have had enough. ");
       }
        rl.close(); //Close the readline Interface
    });
    rl.on('close',()=>{ //On close you have to end the stream otherwise the program will keep listening for lines
        console.log('Thanks!'); //Output a message
        rl.removeAllListeners(); //Remove all the listeners
        process.stdin.destroy(); //Important, you have to destroy the stdin of the process, otherwise the program will never terminate.
    });*/

    /*
    rl.setPrompt('How many cups of coffee have you drunk? '); //Setting a prompt for the rl interface with a question to output to the console.
    rl.prompt(); //Shows the prompt above. Alternative you can use rl.question(Prompt,listener) to do the same in less lines.
    rl.on('line', (answer) => { //When reading a line from stdin
        let cupsConsumed = parseInt(answer); //Parse the answer from a string to an int
        if (cupsConsumed < 3) {
            console.log("I think I will have another one!");
        } else {
            console.log("I think I have had enough. ");
        }
        rl.close(); //Close the readline.Interface
    });
    rl.on('close', () => { //When closing, you have to remove the listeners and destroy the process' stdin stream, otherwise the program will never terminate.
        console.log('Thanks!');
        rl.removeAllListeners();
        process.stdin.destroy();
    });
}
moreCups(); //call the function.


//Alternatively, and more useful, for node you can use inquirer to get userInput.
//First you have to install inquirer so run npm install inquirer
const inquirer=require('inquirer'); //Import the inquirer module
function moreCups(numCups){ //Function for the output.
    if(numCups<3){
        console.log("I think I will have another one!\nThanks!");
    }else{
        console.log("I think I have had enough.\nThanks.");
    }
}
//There are two aspects of inquirer that we are worried about right now: prompt and then.
//Prompt gathers the information from the user while then does something with that information.
inquirer.prompt([ //Prompt takes in an array of objects which contain atleast 3 keys: name, type, and message.
    {
        name: 'cups', //this is what will contain the the user input, which can later be accessed
        type: 'number', //This declares what type of question/input is getting obtained. these include an input(string), multiple choice, number, etc.
        message: 'How many cups have you drunk? ', //This will be the display given to the user.
    },
    ])
    .then((answer)=>{ //After you have gotten the questions filled out by the user, you use .then to do something with those answers
        moreCups(answer.cups); //Like for example passing on the number to another function
    });
*/