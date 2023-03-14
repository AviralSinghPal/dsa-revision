![Alt text](/images/vector%20theory.PNG )



# What is Vector Theory?
Vector Theory is a method of solving maze path problems using direction vectors. In this method, we use a direction vector as an array, for example, [1,0], [1,1], [-1,1], etc., to represent all eight directions. We maintain an array for direction, and use this method to reach from the starting point to the destination.

## How does Vector Theory work?
The basic idea behind Vector Theory is to keep moving in the direction of the destination until we hit a wall or reach the destination. If we hit a wall, we change the direction according to the direction array, and keep moving in that direction until we hit another wall or reach the destination.

The direction vector represents the direction we should move in to get closer to the destination. For example, if we're currently at position (x,y), and the destination is at position (dest_x, dest_y), then the direction vector would be [dest_x-x, dest_y-y].

We then use this direction vector to determine the next move. If we can move in this direction without hitting a wall, we do so, and continue moving in this direction until we either hit a wall or reach the destination. If we hit a wall, we change the direction according to the direction array, and keep moving in that direction until we hit another wall or reach the destination.

By following this method, we can efficiently solve maze path problems, and navigate through complex paths without getting lost.

## Example of Using Vector Theory to Solve a Maze Path Problem
Let's say we have a maze with a starting point at (0,0) and a destination at (4,4). The maze might look something like this:


#######<br>
#S . . . . #<br>
#. # .# . #<br>
#. # .# . #<br>
#. . . # D#<br>
#######<br>
Using Vector Theory, we can find the shortest path between the starting point and the destination by following these steps:

We start at the starting point (0,0).
We calculate the direction vector as [4-0, 4-0], which gives us the direction (4,4).
We check if we can move in the direction of (4,4) without hitting a wall. Since the first move is to the right, we can move in that direction without hitting a wall. We move one step to the right to position (1,0).
We recalculate the direction vector as [4-1, 4-0], which gives us the direction (3,4).
We check if we can move in the direction of (3,4) without hitting a wall. Since there's a wall in that direction, we change the direction according to the direction array, which gives us the direction (-1,1). We move one step in this direction to position (0,1).
We recalculate the direction vector as [4-0, 4-4], which gives us the direction (4,-4).
We check if we can move in the direction of (4,-4) without hitting a wall. Since there's a wall in that direction, we change the direction according to the direction array, which gives us the direction (1,0). We move one step in this direction to position (1,1).
We recalculate the direction vector as [4-1, 4-4], which gives us the direction (3,-3).
We check if we can move in the direction of (3,-3) without hitting a wall. Since there's a wall