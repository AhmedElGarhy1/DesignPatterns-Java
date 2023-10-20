# Observer Design Pattern 

### The problem was how to make 2 pieces of code (Classes) communicate with each others without Pulling mechanism


Lets imagine we have one class that change it's state frequently and i want to know when it changes to make certain action how can i do that?

well we can make a cron job (setInterval) that every `X` second it pull the new state and do action

so what if i have the same scenario but with massive amount on consumers that want to know when the state changes

it will make a the code more complex

### Solution 
`The Solution is to pushing instead of pulling`

so we can now instead of asking every `X sec` did the state change; we can simply Push notifications to all subscribers and make them do actions

`Observable` is the state/thing/object that we want to listen to

`Observer` it the thing/object that interested in `Observable` and what to make action based on the change

**#Observer Pattern**
