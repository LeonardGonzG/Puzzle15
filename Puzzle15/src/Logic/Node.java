package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogonz.gut
 */
public class Node{

    private Node _parent = null;
    private List<Node> _children = new ArrayList<>();
   
    private int[][] _data = new int [4][4];
    private Integer costhPath =-1;
   // private int maxSearchDepth = 0;
    
    public Node(int[][] newData) {
        _data = (int[][]) newData;
    }
    
    public Node(int[][] newData, int costhPath){
        _data = (int[][]) newData;
        this.costhPath = costhPath;
    }

    //Method addChildren
    public void addChildren(List<Node> nodes, int[][] finalNode){
        for (Node node : nodes) {
            addChild(node, finalNode);
        }
    }
   
     public void addChild(Node newNode, int[][] finalNode){
       newNode.setParent(this);
       newNode.setCosthPath(calculateCostPath(newNode, finalNode));
       
        getChildren().add(newNode);
    }
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
    }

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
