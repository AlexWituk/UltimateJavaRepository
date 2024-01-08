# 1.1 Why Programming? Why Java? 

## Leaving Notes in README.md Files

Leave notes here of things you learn while watching the videos. This file is in Markdown format, which allows you to include **bold** and _italic_ text, as well as lists, links, and images. An information-dense cheatsheet for Markdown can be found [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## Trying Out Code in Main.java Files

The `Main.java` files in each folder are meant to be used to try out the code you see in the videos, to experiment with your own code, and to explore the code referenced in the assigned questions. 

There should be a "Run" button at the top of the editor window that will compile and run the code in the `Main.java` file. I also encourage you to occasionally compile and run the code from the command line as this offers additional flexible ways of running the code (more details later). If your terminal is at the base directory (`UltimateJavaRepository`), you can compile and run the files like so:

```
javac Unit01/Topic1_1/Main.java
java Unit01.Topic1_1.Main
```

Sorry about the more complicated syntax for running the code from the command line; it's a necessary Java thing if you're going to keep your code organized in a big repository like this.

## Notes

# Strings and Stuff
Text between /* text here */ is ignored
Class name has to match file name
The Class "System" methods to generate output to the console
System.out is an object that generaties output to the console
System.out.println("prints whatevers in here");
The add ln here ^^ prints the string out on a new line
A string literal is an exact sequence of characters which are enclosed btw 2 quotation marks

# Errors
Syntax/Compiler Error - code does not compile - code is spelled wrong
Exception Error - attempts to divide by zero?
Logic Error - actual output different than anticipated output - + used instead of -

# Variables and Data Types
Primitive data determines the size and type of information
boolean - true or false - 1 bit
int - whole numbers - 32 bit
double - decimal values/floating-point numbers - 64 bit
string - text - non-primitive

Primitive Types are part of Java Language
Except for String, non-primitve types are generally created by programmer
Non-primitive types can use methods to perform actions, but primitives types can't

Variable - name give to a memory location that is holding a specified type value

# Naming A Variable:
may consist of letters, digits, or an underscore (case sensitive)
may not start witha digit
spaces are not allowed
may not use any other characters such as & or @ or $
may not use Java reserved words
good practice is "camel case"

# Declaring Variables
dataType variableName;
ex:
int total;
double intRate;
boolean isWindy;

# Constants
use Java reserved word final in front of declaration
use all caps and underscores in naming them
final double PI;
final int DAY_IN_WEEK;
final boolean JAVA_ROCKS;
