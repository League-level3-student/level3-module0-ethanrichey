//1. create an array of ints. don't initialize it yet. 
  int[] inte;

void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  size(1920, 1080);
  int xsize = 1920;
  int ysize = 1080;
 int height;

  //3. initialize your array with the built in width variable
   int inte [] = new int [xsize];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  float randnum = random(xsize);
  

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(24, 100, 150);

  //7. set the color for your graph
  fill(150, 200, 50);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
  rect(inte[0], height, 1, -inte[0]); 

  //9. call the stepSort method
  stepSort(inte);

  //10. extract the code that randomizes the array into a method.
  void makeRandom (int[] arr){
   for(int f = 0, f < int[] arr.length, i++){
     
   }
    
  }
    
  }

  //11. call the method you made in step 10 when the mouse is pressed
  
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}