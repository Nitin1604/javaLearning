# javaLearning                                                                                                                               

Java YouTube Link:-
https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&si=-7W0IE5zgvaesM8W

Point 1:-
```
System.out.print() --> No newline at the end
System.out.println() --> Newline at the end
System.out.printf("%c",ch) 
```

Point 2:-
```
   |---> %d for int
   |---> %f for float
   |---> %c for char
   |---> %s for string
```
Associativity tells the direction of execution of operators. It can either be left to right or right to left. 

Point 3:-
```
1. Result = byte + string -> int
2. Result = string + int -> int
3. Result = long + float -> float
4. Result = int + float -> float
5. Result = char + int -> int
6. Result = char + string -> int
7. Result = long + double -> double
8. Result = float + double -> double
```

Point 4:-
```
And Operator -> It evalutes to true if both conditions are true
True and False Truth Table
True && True = True
True && False = False
False && True = False
False && False = False
```

Point 5:-
```
OR operator -> It evaluates to true when at least one of the conditions is true
True or False Truth Table
True || True = True
True || False = True
False || True = True
False || False = False
```

Point 6:-
```
NOT operator -> It negates the given logic (true becomes false and false becomes true)
!True = False
!False = True
```
Point 7:-
```
This keyword:-
this is a way for us to reference an object of the class which is being created/referenced

this.area =  2 -> this is a reference to current object
```
Point 8:-
```
Super Keyword:-
A reference variable used to refer immediate parent class object
1. It can be used to refer immediate parent class instance variable
2. It can be used to invoke parent class methods
3. It can be used to invoke parent class constructors
```
Point 9:-
```
Interfaces in Java
In java interface is a group of related methods with empty bodies.

An example is as follows

interface Bicycle {
    void applyBrake(int decrement);
    void speedup(int increment);
 }

class AvonCycle implements Bicycle {
    int speed = 7;
    void applyBrake(int decrement){
         speed = speed - decrement;
     }
    void speedup(int increment) {
	speed = speed + increment;
   }
}
```
![image](https://github.com/user-attachments/assets/ff523d7c-0871-451a-8c31-d6b7b4165ad5)
Truth Table AND Gate

![image](https://github.com/user-attachments/assets/3004c5e5-861b-4c1f-9bc3-a4d19a54f71d)
Truth Table OR Gate

```
Is Java Compiled or Interpreted?
Java is a hybrid language -> both compiled as well as interpreted

1. A JVM can be used to interprete this bytecode
2. This bytecode can be taken to any platform(win/Mac/Linux)
3. Hence Java is platform independent (write once run everywhere
```
