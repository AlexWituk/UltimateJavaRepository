# Unit 10 - Recursion

## 10.1 - Recursion
Recursive method - a method that calls itself       
Use conditional statements to stop loop     
> public static void method(int n) {        
    if (n<2) {      
        method(n+1);        
    }       
}

## 10.2 - Recursive Searching and Sorting
Binary search - low value and high value > finds middle > if number if greater than or less than then walls move accordingly > repeat till number is found      
ONLY WORKS IF VALUES ARE SORTED 

Merge sort - left right merge
> mergeSort (myArray,low,high) {        
    if (low < high ) {      
        middle = (low+high) / 2;        
        mergeSort(myArray,low,middle);      
        mergeSort(myArray,low,middle+1,high);       
        merge(myArray,low,middle,high);     
    }       
}