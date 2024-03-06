# Unit 6 - Array

## 6.1 - Array Creation and Access
Array - is a collection (list) of primitive or object reference data    
Element - singlue value in array        
Index - position of object in array (starts at 0)       
Length - number of elemts in array

Initialization:
> dataType [] name = new dataType[length];      
name[index] = value;

> int [] listOne = new int[5];  
listOne[2] = 33;

> int [] list;      
list = new int[5]

> String [] petNames = {"Ember", "Truman", "Izzy"};


Elements of type int start at 0     
Object reference types start as `null`      
Once array is made its length cannot be changed
## 6.2 - Traversing Arrays
Means accessing each element of an array        
For loops are good for this:

> int [] list = new int[5];     
for(int i = 0; i < list.length; length++) {      
        int[] = (int) Math.random() * 10;       
}

## 6.3 - Enhanced for Loop for Arrays
Goes through every element in array             
Example:        

>int [] values = {1, 2, 3, 4, 5};        
for (int num : values) {              
        System.out.println(number);             
}

`num` here is a copy of a value from the array

## 6.4 - Developing Algorithms Using Arrays
You can find min and max in an array using for loops 
