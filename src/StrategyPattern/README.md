# Strategy Design pattern
***EX: Nodejs Passport Authentication Package***

### The problem was in inheritance

If we have a duck that can quack and fly and display the flying is shared and quacking is shared but each one needs to implement its display

### So inheritance is a solution 

But if I want to make an duck that can't fly what should u do?

Simply override the fly to be empty 

### Inheritance Problems
So what if I want to make the quack loud and it can't fly I will override the 2 methods with duplicated code (can't fly) 

So what if I want to make quack loud and it can fly I will also duplicate the code because there is no horizontal inheritance
```
    duck
   /    \
  /      \ 
duck A   Duck B
```
The duck A can't share code with Duck B

### Solution
The Solution is to make use of composition instead of inheritance and interfaces

So for the previous example,
You can create interface IQuack, IFly, IDisplay and make use of dependency injection or hard code the classes

Now you can create a separated class for LoudQuack and NotFly and make use of these Classes in the code

**#Strategy Pattern**
