# triangle star tree
### How to build tree
- this is a simple program to build a tree with stars
```
    *
  * * *
* * * * *
    *
  * * *
```
- I split the tree into 2 parts, the top and the bottom each part is a triangle then I create a function to create the triangle
```
    *
  * * *
* * * * *
```
```
    *
  * * *
```
- To create triangle I need height of the triangle, so I create a tail recursive function that need height, current line and string accumulator to create the triangle
- each line of the triangle is created by 3 parts, the left side, the right side of the triangle and the middle part number of stars is equal to the `current line * 2 + 1` and the space of the left and right side is equal to `height - current line - 1`

### How to test
- I create a testing class using JUint to test the program