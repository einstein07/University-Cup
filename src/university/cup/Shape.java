
package university.cup;

/**
 * Shape class
 * @author Sindiso
 */
public class Shape {
    private int id;
    private int bounding_box;
    private int capacity;
    private int orientations [][][];

    /**
     * Constructor
     * @param id
     * @param bounding_box
     * @param capacity
     * @param rows
     */
    public Shape(int id, int bounding_box, int capacity, int rows) {
        this.id = id;
        this.bounding_box = bounding_box;
        this.capacity = capacity;
        this.orientations = new int [4][rows][2];
    }
    
    int [][] getShape(int orientation){
        return this.orientations[orientation];
    }

    /**
     * Returns shape id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Returns bounding box
     * @return int
     */
    public int getBounding_box() {
        return bounding_box;
    }

    /**
     * Returns shape capacity
     * @return int
     */
    public int getCapacity() {
        return capacity;
    }
    
    
    
    
}
