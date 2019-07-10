/**
 * @author Ethan Ly
 * @author Chandan Reddy
 * CIS 36B, Lab 3
 */

package maze_game;

public class Rat {
    public int posX;
    public int posY;
    
    /**
     * Sets the x (column) location of the rat
     * @param x the x position of the rat in the x-y plane
     */
    public void setXPos(int x) {
        posX = x;
    }
    
    /**
     * Sets the y (row) location of the rat
     * @param y the y position of the rat in the x-y plane
     */
    public void setYPos(int y) {
        //fill in here
    	posY = y;
    }
    
    /**
     * Returns the x position of the rat
     * @return the x position of the rat in the x-y plane
     */
    public int getXPos() {
        return posX;
    }
    
    /**
     * Returns the y position of the rat
     * @return the y position of the rat in the x-y plane
     */
    public int getYPos() {
        //fill in here
    	return posY;
    }
    
    /**
     * Moves the rat one space to the left
     * by subtracting one from its x position
     */
    public void moveLeft() {
        //fill in here
    	posX--;
    }
    
    /**
     * Moves the rat one space to the right
     * by adding one to its x position
     */
    public void moveRight() {
        //fill in here
    	posX++;
    }
    
    /**
     * Moves the rat one space down
     * by adding one to its y position
     */
    public void moveDown() {
        //fill in here
    	posY++;
    }
    
    /**
     * Moves the rat one space up
     * by subtracting one from its y position
     */
    public void moveUp() {
        //fill in here
    	posY--;
    }

}
