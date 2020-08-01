
package university.cup;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sindiso
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
    
    public int block(int r, int c){
        int overlap = 0;
        if(this.grid[r][c] == 1)
            overlap = 1;
        else
            this.grid[r][c] = 1;
        return overlap;
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
