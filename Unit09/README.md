# Unit 9 - Inheritance

## 9.1 - Creating Superclasses and Subclasses
Superclasses are above subclasses - superclasses have the common characteristics

Initilzation:
> public class Performer { code }       
public class Musician extends Performer { code }

## 9.2 - Writing Constructors for Subclasses
Constructors are not inherited      
when making a subclass object you can only use the subclasses construtors UNLESS        
you use `super();` has to be first line

In subclass constructor:
> public Musician(String n, int a, String inst) {       
    super(n, a);
    instrument = inst;
}

## 9.3 - Overriding Methods
Override methods - subclass methods that override the superclasses’	    
No special syntax for it just put in subclass

## 9.4 - super Keyword
`Super` keyword allows you to call methods from superclass		    
super.perform();		    
Useful for overridden methods

## 9.5 - Creating References Using Inheritance Hierarchies
You can make an array/list of a superclass and fill it with the subclasses      
You can't create a subclass object and fill it with the superclass data

## 9.6 - Polymorphism
A reference variable to polymorphic when it can refer to objects from different classes at different points in the code

## 9.7 - Object Superclass
the `toString()` of an object is pretty useless
You can make a custom `toString()` method in an object to print useful info