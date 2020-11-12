/*
    Name of the course ('JavaScript Applications')
    Name of the second teacher ('Shane')
    Name of the first student ('Steve')
    Katy's computer type ('macbook')
    The preReq equipment object
    The second OSOption from equipment prereqs ('osx')
    String listing the OSOptions separated by 'or' ('linux or osx')
    An array of all the students that are using osx
 */

let course = {
    name: 'JavaScript Applications',
    awesome: true,
    teachers: ['Assaf', 'Shane'],
    students: [
        {
            name: 'Steve',
            computer: {
                OS: 'Linux',
                type: 'laptop'
            }
        },
        {
            name: 'Katy',
            computer: {
                OS: 'OSX',
                type: 'macbook'
            }
        },
        {
            name: 'Chuck',
            computer: {
                OS: 'OSX',
                type: 'macbook'
            }
        }

    ],
    preReqs : {
        skills : ['html', 'css', 'git'],
        equipment: {
            laptop: true,
            OSOptions: ['linux', 'osx']
        }
    }
};

console.log(course.name); //Course Name
console.log(course.teachers[1]); //Name of second teacher
console.log(course.students[0].name); //Name of first student
console.log(course.students[1].computer.type); //Katy's computer time
console.log(course.preReqs.equipment); //prereq equipment object
console.log(course.preReqs.equipment.OSOptions[1]); //second option in osooptions
console.log(course.preReqs.equipment.OSOptions.join(' or ')); //string that contains OSOptions separated by a or
let OSXStudents=[]; //array object containing all students using OSX
for(let i=0; i<course.students.length; i++){
    if(course.students[i].computer.OS==='OSX'){
        OSXStudents.push(course.students[i]);
    }
}
console.log(OSXStudents);