/*
Challenge 4 + Challenge 7

Create a single object named "slideshow" that represents the data and functionality of a picture slideshow. There should be NO VARIABLES OUTSIDE THE OBJECT. The object should have properties for:
    An array called photoList that contains the names of the photos as strings
    An integer currentPhotoIndex that represents which photo in the photoList is currently displayed
    A nextPhoto() function that moves currentPhotoIndex to the next index ifthere is one, and:
        logs the current photo name.
        Otherwise, log "End of slideshow";
    A prevPhoto() function that does the same thing, but backwards.
    A function getCurrentPhoto() that returns the current photo from the list.



    Create an empty property named playInterval
    A play() function that moves to the next photo ever 2000ms until the end.
        Tip - use playInterval = setInterval(fn,ms).
    A pause() function that stops the slideshow
         Tip - use clearInterval(playInterval)
    Automatically pause the slideshow if it gets to the end of the photolist while playing.
 */
let slideshow= {
    photolist: ['photo1.png', 'photo2.jpg', 'photo3.heic'],
    currentPhotoIndex: 0,
    nextPhoto: function () {
        if (this.currentPhotoIndex + 1 > this.photolist.length) {
            console.log('End of slideshow');
            this.pause(); //If it reaches the end of the slide show you want to pause
        } else {
            console.log('Photo: ' + this.photolist[this.currentPhotoIndex]);
            this.currentPhotoIndex++;
        }
    },
    prevPhoto: function () {
        if (this.currentPhotoIndex - 1 < 0) {
            console.log('End of slideshow');
            this.pause();
        } else {
            console.log('Photo: ' + this.photolist[this.currentPhotoIndex]);
            this.currentPhotoIndex--;
        }
    },
    getCurrentPhoto: function () {
        if (this.currentPhotoIndex < 0 || this.currentPhotoIndex >= this.photolist.length) {
            if (this.currentPhotoIndex < 0) {
                this.currentPhotoIndex++;
            } else {
                this.currentPhotoIndex--;
            }
        }
        console.log('Photo ' + this.photolist[this.currentPhotoIndex]);
    },

    playInterval: null, //an Empty property is NULL

    play: function(){ //You don't want to use arrow functions because it has no access to this or super, and shouldn't be used as methods (which this is considered as)
        // let self=this; //Since we are using arrow functions, the context is implicitly assigned so this isn't needed, otherwise this would look somewhat different.
        //this.playInterval=setInterval(function(){self.nextPhoto()},2000);
        console.log(this.photolist[this.currentPhotoIndex]);
        this.playInterval = setInterval(() => this.nextPhoto(), 2000);
    },

    pause: function(){
        clearInterval(this.playInterval);
    }
}

slideshow.play();