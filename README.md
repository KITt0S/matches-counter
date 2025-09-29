# Matches counter

## Description

This is a program to count minimum number of matches required to build N squares.

## Algorithm

The main idea is to build a maximum possible square and add last layer of squares starting from top left and ending at right bottom.

1)
```
 _
|_|
```

2) 
```
 _
|_|
|_|
```
  
3) 
```
 _ _
|_|_|
|_|
```
  
4)
```
 _ _
|_|_|
|_|_|
```
  
5)
```
 _
|_|_
|_|_|
|_|_|
```
  
6)
```
 _ _
|_|_|
|_|_|
|_|_|
```

7)
```
 _ _ _
|_|_|_|
|_|_|
|_|_|
```

etc...