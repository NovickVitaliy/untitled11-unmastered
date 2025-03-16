1. Change class name from ```humanIMB``` to ```HumanImb```
2. Refactor fields name from uppercase letters to lowercase words

FROM:
![alt text](src/image.png)

TO: 
![alt text](src/image-1.png)

3. Remove comments (best comment is the not written on)

4. Change field ```imb``` to non static one
5. Change method ```Result()``` to non static one
6. Change method ```takeImt()``` to non static one
7. Rename method ```Result()``` to ```result()```
8. Rename method ```takeW()``` to ```getWeight()```
9. Rename method ```putW()``` to ```setWeight()```
10. Rename method ```takeH()``` to ```getHeight()```
11. Rename method ```putH()``` to ```setHeight()```
12. Rename method ```takeImt()``` to ```getImb()```
13. Rename constructor parameters
FROM:

![alt text](src/image-2.png)

TO:

![alt text](src/image-3.png)

14. Rename parameter in the ```setWeight()``` method

FROM:

![alt text](src/image-4.png)

TO:
![alt text](src/image-5.png)

15. Rename parameter in the ```setHeight()``` method

FROM: 

![alt text](src/image-6.png)

TO:

![alt text](src/image-8.png)

16. Add blank lines after classes, functions, fields, etc

BEFORE:

![alt text](src/image-9.png)

AFTER:

![alt text](src/image-10.png)

15. Fix spaces

BEFORE:

![alt text](src/image-11.png)


AFTER:

![alt text](src/image-12.png)

16. Change fields visibility from public to private (because if we change theirs values via fields the imb is not going to be recalculated)

BEFORE:

![alt text](src/image-13.png)

AFTER:

![alt text](src/image-14.png)

17. Use logical operators instead of bitwise

BEFORE:

![alt text](src/image-15.png)

AFTER:

![alt text](src/image-16.png)

18. Rename ```string``` variable in the ```result()``` method to ```result```

BEFORE:

![alt text](src/image-17.png)

AFTER:

![alt text](src/image-18.png)

19. Initialize variable ```result``` with empty string instead of null 

BEFORE:

![alt text](src/image-19.png)

AFTER:

![alt text](src/image-20.png)

20. Create enum ```ImbStatus``` and use it instead of magical strings


![alt text](src/image-21.png)   


Usage:

![alt text](src/image-22.png)

21. Move ```HumanImb``` class to the separate file