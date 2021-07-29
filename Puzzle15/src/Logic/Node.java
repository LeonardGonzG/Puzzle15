package Logic;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogonz.gut
 */
public class Node {

    private Node _parent = null;
    private List<Node> _children = new ArrayList<>();

    private int[][] _data = new int[4][4];
    private Integer costhPath = -1;
    // private int maxSearchDepth = 0;

    public Node(int[][] newData) {
        _data = (int[][]) newData;
    }

    public Node(int[][] newData, int costhPath) {
        _data = (int[][]) newData;
        this.costhPath = costhPath;
    }

    //Method addChildren
    public void addChildren(List<Node> nodes, int[][] finalNode) {
        for (Node node : nodes) {
            addChild(node, finalNode);
        }
    }

    public void addChild(Node newNode, int[][] finalNode) {
        newNode.setParent(this);
        newNode.setCosthPath(levelTree()+calculateCostPath(newNode, finalNode));
        //newNode.setCosthPath(calculateCostPath(newNode, finalNode));

        getChildren().add(newNode);
    }

    public int calculateCostPath(Node newNode, int[][] finalNode) {

        Point A = new Point();
        Point B = new Point();
        int costPath = 0;

        for (int i = 0; i < newNode._data.length; i++) {

            for (int j = 0; j < newNode._data[0].length; j++) {

                A = searchPoint(newNode._data, newNode._data[i][j]);
                B = searchPoint(finalNode, newNode._data[i][j]);
                
                costPath+= distanceManhattan(A,B);
            }
        }

        return costPath;

    }

    public int distanceManhattan(Point A, Point B) {

        return (int) (Math.abs(A.getX() - B.getX()) + Math.abs(A.getY() - B.getY()));
    }

    public Point searchPoint(int[][] node, int number) {

        Point spot = new Point();

        for (int i = 0; i < node.length; i++) {

            for (int j = 0; j < node[0].length; j++) {

                if (node[i][j] == number) {

                    spot.setLocation(i, j);
                    return spot;

                }

            }

        }

        return spot;

    }

    public int levelTree(){
    
        Node thereNode = this;
        int level = 1;
        
        while (thereNode != null) {
            level++;
            thereNode = thereNode.getParent();
        
        }
        
       // System.out.println("level: "+ level);
        return level;
    
    }
    
    /*
    //Número de posiciones correctas con base a la solución
    private int calculateCostPath(Node newNode, int[][] finalNode){
   
        int costPath = 0;
        for(int i=0; i<newNode._data.length; i++){
            for(int j=0; j<newNode._data[0].length; j++){
                if(newNode._data[i][j]==finalNode[i][j]){
                costPath++;
                }
            }
        }
        
        return costPath;
    }*/
    /**
     * @return the _data
     */
    public int[][] getData() {
        return _data;
    }

    /**
     * @param _data the _data to set
     */
    public void setData(int[][] _data) {
        this._data = _data;
    }

    /**
     * @return the costhPath
     */
    public Integer getCosthPath() {
        return costhPath;
    }

    /**
     * @param costhPath the costhPath to set
     */
    public void setCosthPath(Integer costhPath) {
        this.costhPath = costhPath;
    }

    /**
     * @return the _parent
     */
    public Node getParent() {
        return _parent;
    }

    /**
     * @param _parent the _parent to set
     */
    public void setParent(Node _parent) {
        this._parent = _parent;
    }

    /**
     * @return the _children
     */
    public List<Node> getChildren() {
        return _children;
    }

    /**
     * @param _children the _children to set
     */
    public void setChildren(List<Node> _children) {
        this._children = _children;
    }

}
