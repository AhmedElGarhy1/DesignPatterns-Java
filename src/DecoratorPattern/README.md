# Decorator Design Pattern

Decorator Pattern is just a wrapper for a class/object to perform additional functionality 

### Example

if we have a coffee shop and they are selling coffee cups there are many cups they sell

## Problem
so for example we have espresso, frappuccino and iceCoffee 

and also we have  caramel, doubleCaramel,  chocolate, lotus, ect...

so we have class 
```text
Espresso, EspressoWithCaramel, EspressoWithDoubleCaramel, EspressoWithLotus, EspressoWithChocolate, EspressoWithCaramelAndLotus
```
this for just espresso so it isn't a good idea to do so

## Solution

Now we can use the decorator pattern to solve this problem

First we will create the base classes
and create decorators `(AddLotusDecorator, AddCaramelDecorator, AddChocolateDecorator)`

when we want to add any extra flavor we can use the decorator like following
```java
    Cup espressoWithLotus = new AddLotusDecorator(new EspressoCup); 
```

**#Decorator Pattern**
