/**
 * @author Ethan Ly
 * @author Chandan Reddy
 * CIS 36B, Lab 3
 */

package maze_game;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) throws IOException{
        String maze[][];
        //declare your Rat object here 
        Rat rat = new Rat();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Maze Runner!\n");
        
        //rest of main method   
        System.out.print("Please enter the name of the file: ");
        String inFile = input.nextLine();
        Scanner fileScan = new Scanner(new File(inFile));
        int size = fileScan.nextInt();
        maze = new String[size][size];
        int row = 0;
        int col = 0;
        
        while(fileScan.hasNext() && row < size) {
        	maze[row][col] = fileScan.next();
        	col++;
        	if(col == size) {
        		row ++;
        		col = 0;
        	}
        }
        //then set its position once you found starting and end position
        for(int i = 0; i < size; i++) {
        	if(maze[maze.length - 1][i].equalsIgnoreCase("X")) {
        		rat.setYPos(maze.length - 1);
        		rat.setXPos(i);
        		break;
        	}
        }
        
        //finding the cheese
        while(!maze[rat.getYPos()][rat.getXPos()].equalsIgnoreCase("D")) {
        	maze[rat.getYPos()][rat.getXPos()] = "*";
        	
        	if(((rat.getYPos() - 1) > -1) && ((maze[rat.getYPos() - 1][rat.getXPos()].equalsIgnoreCase("X")) || (maze[rat.getYPos() - 1][rat.getXPos()].equalsIgnoreCase("D")))) {
        		rat.moveUp();
        	} else 
    		if(((rat.getYPos() - 1) > -1) && ((maze[rat.getYPos()][rat.getXPos() - 1].equalsIgnoreCase("X")) || (maze[rat.getYPos()][rat.getXPos() - 1].equalsIgnoreCase("D")))) {
        		rat.moveLeft();
        	} else
        	if(((rat.getYPos() + 1) < size) && ((maze[rat.getYPos()][rat.getXPos() + 1].equalsIgnoreCase("X")) || (maze[rat.getYPos()][rat.getXPos() + 1].equalsIgnoreCase("D")))) {
            	rat.moveRight();
            } else 
            if(((rat.getYPos() + 1) < size) && ((maze[rat.getYPos() + 1][rat.getXPos()].equalsIgnoreCase("X")) || (maze[rat.getYPos() + 1][rat.getXPos()].equalsIgnoreCase("D")))) {
        		rat.moveDown();
        	} else {
        		break;
        	}
        }
        
        //when cheese is found
        if(maze[rat.getYPos()][rat.getXPos()].equalsIgnoreCase("D")) {
        	System.out.println("\nMunch! Munch! Munch!");
        	
        	maze[rat.getYPos()][rat.getXPos()] = "&";
        	printMaze(maze);
        }
        
        input.close();
        
    } //end of main
    
    /**
     * Prints out the 2D maze to the console
     * @param maze the 2D array representing the maze
     */
    public static void printMaze(String maze[][]) {
        System.out.println("\nMaze:");
        //rest of printMaze method    
        for(int i = 0; i < maze.length; i++) {
        	for(int j = 0; j < maze[i].length; j++) {
        		System.out.print(maze[i][j] + " ");
        	}
        	System.out.println();
        }
    } //end of printMaze

} //end of class