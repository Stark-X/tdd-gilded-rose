# Tasking 

## Regular Good

1. 
    - Given the good's quality is 1,
    - And good is not expired,
    - When a day pass,
    - Then quality and sellIn reduce 1
    
2. 
    - Given the good's quality is 0,
    - And good is not expired,
    - When a day pass,
    - Then quality still 0
    - And sellIn reduce 1
3. 
    - Given the good's quality is greater or equal than 2,
    - And good is expired,
    - When a day pass,
    - Then quality reduce 2
    - And sellIn reduce 1
4. 
    - Given the good's quality is 1,
    - And good is expired,
    - When a day pass,
    - Then quality is 0
    - And sellIn reduce 1

## Aged Brie

1. 
    - Given the good's quality is less than 50,
    - And good is not expired,
    - When a day pass,
    - Then quality enhance 1
    - And sellIn reduce 1
2. 
    - Given the good's quality is 50,
    - And good is not expired,
    - When a day pass,
    - Then quality is 50
    - And sellIn reduce 1
3. 
    - Given the good's quality is less than 49,
    - And good is expired,
    - When a day pass,
    - Then quality enhance 2
    - And sellIn reduce 1
4. 
    - Given the good's quality is 48,
    - And good is expired,
    - When a day pass,
    - Then quality is 50
    - And sellIn reduce 1
    

## Sulfuras

1. 
    - Given good is expired or not,
    - When a day pass,
    - Then quality don't change
    - And sellIn is 0
    
## Backstage Pass

1. 
    - Given the good's quality is less than 50,
    - And good's sellIn is greater than 10,
    - When a day pass,
    - Then quality enhance 1
    - And sellIn reduce 1
2. 
    - Given the good's quality is less than 49,
    - And good's sellIn is greater than 4 and less or equal than 10,
    - When a day pass,
    - Then quality enhance 2
    - And sellIn reduce 1
3. 
    - Given the good's quality is less than 48,
    - And good's sellIn is less or equal to 5 and greater than 0,
    - When a day pass,
    - Then quality enhance 3
    - And sellIn reduce 1
4. 
    - Given the good's quality is greater than 48,
    - And good's sellIn is greater than 4 and less or equal than 10,
    - When a day pass,
    - Then quality is 50
    - And sellIn reduce 1
5. 
    - Given the good's quality is greater than 47,
    - And good's sellIn is less or equal to 5 and greater than 0,
    - When a day pass,
    - Then quality is 50
    - And sellIn reduce 1
6. 
    - Given the good's quality is any,
    - And good's sellIn is less or equal than 0,
    - When a day pass,
    - Then quality is 0
    - And sellIn reduce 1
