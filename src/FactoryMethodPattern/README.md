# Factory Method Design Pattern

## General UML
![Factory Method Design Pattern](https://refactoring.guru/images/patterns/diagrams/factory-method/solution1.png)

### Problem
Great news, right? But how about the code? At present, most of your code is coupled to the `Truck` class. Adding `Ships` into the app would require making changes to the entire codebase. Moreover, if later you decide to add another type of transportation to the app, you will probably need to make all of these changes again.

As a result, you will end up with pretty nasty code, riddled with conditionals that switch the app’s behavior depending on the class of transportation objects.

### Solution
The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.
![Factory Method Design Pattern Example](https://refactoring.guru/images/patterns/diagrams/factory-method/solution2-en.png)

**#Factory Method Pattern**
