/*
Challenge 4

Create a single object named "slideshow" that represents the data and functionality of a picture slideshow. There should be NO VARIABLES OUTSIDE THE OBJECT. The object should have properties for:
    An array called photoList that contains the names of the photos as strings
    An integer currentPhotoIndex that represents which photo in the photoList is currently displayed
    A nextPhoto() function that moves currentPhotoIndex to the next index ifthere is one, and:
        logs the current photo name.
        Otherwise, log "End of slideshow";
    A prevPhoto() function that does the same thing, but backwards.
    A function getCurrentPhoto() that returns the current photo from the list.
 */
let slideshow={
    photolist: ['photo1.png', 'photo2.jpg', 'photo3.heic'],
    currentPhotoIndex: 0,
    nextPhoto: function() {
        if(this.currentPhotoIndex+1>this.photolist.length){
            console.log('End of slideshow');
        }else{
            console.log('Photo: ' + this.photolist[this.currentPhotoIndex]);
            this.currentPhotoIndex++;
        }
    },
    prevPhoto: function(){
        if(this.currentPhotoIndex-1<0){
            console.log('End of slideshow');
        }else{
            console.log('Photo: ' + this.photolist[this.currentPhotoIndex]);
            this.currentPhotoIndex--;
        }
    },
    getCurrentPhoto: function(){
        if(this.currentPhotoIndex<0 || this.currentPhotoIndex>=this.photolist.length){
            if(this.currentPhotoIndex<0){
                this.currentPhotoIndex++;
            }else{
                this.currentPhotoIndex--;
            }
        }
        console.log('Photo ' + this.photolist[this.currentPhotoIndex]);
    }

}
slideshow.getCurrentPhoto();
slideshow.prevPhoto();
slideshow.nextPhoto();
slideshow.nextPhoto();
slideshow.nextPhoto();
slideshow.nextPhoto();
slideshow.getCurrentPhoto();
console.log(slideshow.currentPhotoIndex);