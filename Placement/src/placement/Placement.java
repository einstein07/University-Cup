/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lesego
 */
public class Placement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        File file = new File("grid_1.input"); 
        Scanner key = new Scanner(file); 
        String Dimensions = key.nextLine();
      
        String[] line = Dimensions.split(",");
        int gridDimenR= Integer.parseInt(line[0]);
        System.out.println(gridDimenR);
        int gridDimenC = Integer.parseInt(line[1]);
        System.out.println(gridDimenC);
        int shapes = key.nextInt();
        System.out.println("SHape"+shapes);
        int blockedCells = key.nextInt();
        
          ArrayList<String> shapeids = new ArrayList<>();
//        ArrayList<String> cells = new ArrayList<>();
        while (key.hasNextLine()) {
            //System.out.println(key.nextLine());
            shapeids.add(key.nextLine());
//            cells.add(key.nextLine());
       }
    }
    
}
