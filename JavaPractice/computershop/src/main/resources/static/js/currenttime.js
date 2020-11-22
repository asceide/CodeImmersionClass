//So this assigns an element from a document with an according id to a variable (in this case being an element in the html file with the id of clock
let clockElement=document.getElementById("clock")
//We create a function to get the computer time
function clock(){
    let getTime = new Date(); //Date object
    let date = getTime.toLocaleDateString(); //get the string representation of the date
    let currentTime = getTime.toLocaleTimeString('en-US'); //same for the current time
    clockElement.textContent=`${date} at ${currentTime}`; //Assign it as the text content for the element gotten from the var
}
setInterval(clock,1000)