/*
    Find a player with the name 'Mike'
    Get an array of all players with position 'RB'
    Get an array of all the players lastNames
    Get an array of the full names of all the running backs with more than 5 touchdowns
    Get the number of touchdowns scored by Running backs
 */

let players = [
    {firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
    {firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
    {firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
    {firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
    {firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
    {firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
    {firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2}
];

let mike = players.find(player=>player.firstName==='Mike');//Simple enough, the first object that contains the name of Mike is returned


let runningBack=players.filter(player=>player.position==='RB'); //An array containing the filtered objects is returned, in this case being an array of Running Back

console.log(runningBack);

let playerLastName=players.map(player=>`${player.lastName}`); //An array that contains all of the players last name is returned

console.log(playerLastName.join(', '));
//This is a two parter: first a filter is applied and an array of objects with the filters applied is returned, then that array is mapped with the players first and last names.
let rbNames=players.filter(player=>player.touchdowns>5 && player.position==='RB').map(player=>`${player.firstName} ${player.lastName}`);


console.log(rbNames.join(', '));

let rbTDs=players.filter(player=>player.position==='RB').reduce((tds,player)=>tds+=player.touchdowns,0); //Remember that reduce needs two parameters, callback function and an initial number.
console.log(rbTDs);