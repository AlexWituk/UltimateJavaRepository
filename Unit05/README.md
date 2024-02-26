# Unit 05 - Writing Classes

## 5.1 - Anatomy of a Class
Private: can only be accessed in their own class

Public: can be accessed outside their own class

---

Classes - `public` - always

Instance Vars - `private` - always (encapsulation)

Constructors - `public` - always

Methods - `public` or `private`

## 5.2 - Constructors
Each class "has-a" private instance variable

Default constructor has no input and has default values

Need to set all instance vars to something in constructors even if not used


## 5.3 - Documentation with Comments
Comments are ignored by compiler/interpreter - help make code readable

// single line comment

/* multi-line comment */

/** Documentation * Comment * to create Javadoc */


## 5.4 - Accessor Methods
Accessor Methods: methods that return the value of an instance variable - must be public

Allows for class objects to be printed

>// in class    
public String toString() {return instance vars as string;}  
//outside class     
System.out.println(class object);


## 5.5 - Mutator Methods
Mutator Methods: change values of instance vars

>public void setName(String n) {name = n;}

## 5.6 - Writing Methods
You can use public methods and constructors in other classes

Method header has 5 parts:  

Access level - public or private    
Ownership - whether `static` is included    
Return Type - the data returned by method (can be primitve, reference, or void)     
Identifier - name of method     
Parameter List - enclosed in parathesis, states data types for each parameter used in method


## 5.7 - Static Variables and Methods
Static data is not instance data (vars)  
Static methods are used when accessing static data

## 5.8 - Scope and Access

## 5.9 - `this` Keyword

## 5.10 - Ethical and Social Implications of Computing Systems
