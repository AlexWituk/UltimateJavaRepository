# Unit 8 - 2D Array

## 8.1 - 2D Array
2D Array - An array made out of arrays      

Initilization
> new DataType[ number of rows ] [columns/length of each array row]     
new int [7] [4]     
String[][] grid = new String[4][5];

You can access values inside a 2D array by using:
> arrayName[row][column]


## 8.2 - Transversing 2D Arrays
Use nested for loops and enchanced nested for loops to traverse 2D arrays

> for (int row = 0; row < grid.length; row++) {       
    for (int col = 0; col < grid[0].length; row++) {        
        System.out.println(grid[row][col]);
    }      
}
