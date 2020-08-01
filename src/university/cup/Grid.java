/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.cup;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root07
 */
public class Grid {
    private int r;
    private int c;
    
    private int [][] grid;

    public Grid(int r, int c) {
        this.r = r;
        this.c = c;
        grid = new int [r][c];
        for (int i = 0; i < this.r; i++){
            for (int j = 0; j < this.c; j++){
                grid[i][j] = 0;
            }
        }
    }
    
    public void block(int r, int c){
        this.grid[r][c] = 1;
    }
    
    public List getEmptySpaces(){
        List <String> empty = new ArrayList<String>();
        for (int i = 0; i < this.r; i++){
            for (int j = 0; j < this.c; j++){
                if(this.grid[i][j] == 0)
                    empty.add(i+","+j);
            }
        }
        return empty;
    }
    
    
}
