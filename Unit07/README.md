# Unit 7 - `ArrayList`

## 7.1 - Introduction to `ArrayList`
ArrayLists are:     
resizble length     
a class with many methods       
not designed to store primitvies

Intializaiton:      
>//put at beginning of file     
import java.util.ArrayList;     

>//when intigilitzation       
ArrayList< DataType> variableName = new ArrayList< DataType>(numberOfElements);



CANT STORE PRIMITIVES       
must use wrapper classes(Interger, Double, Boolean)

## 7.2 - `ArrayList` Methods
Size of ArrayList:      
>listName.size(); //returns an int

Adding Items to ArrayList:
>listName.add(index, object); //adds to end if no index

Deleting Items from ArrayList:      
>listName.remove(index or objectName); 

Updating Items in ArrayList:        
>listName.set(index, object);

Accessing Items in ArrayList:       
>listName.get(index);

## 7.3 - Traversing `ArrayList`s
Dont overtraverse ArrayLists when using for loops

You can't change size of an ArrayList or update an element while use an enhanced for loop

## 7.4 - Developing Algorithms Using `ArrayList`s
Very similar to normal arrays

## 7.5 - Searching
ArrayLists dont use [] when searching through them

When searching though int vales, use ==     
When searching for a double value, we need to make sure the value is close enough by doing math     
Object instances hsould always use the .equals(otherThing)      

When searching to remove an element, start from back of list to not skip elements

## 7.6 - Sorting
Good to use 2 for loops when sorting

## 7.7 - Ethical Issues Around Data Collection
