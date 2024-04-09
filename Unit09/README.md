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

## 9.4 - super Keyword

## 9.5 - Creating References Using Inheritance Hierarchies

## 9.6 - Polymorphism

## 9.7 - Object Superclass
