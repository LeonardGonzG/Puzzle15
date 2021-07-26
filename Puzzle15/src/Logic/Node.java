package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogonz.gut
 */
public class Node<Type>{

    private Node<int[][]> _parent = null;
    private List<Node<Type>> _children = new ArrayList<>();
   
    private int[][] _data = new int [4][4];
    private Integer costhPath =-1;
   // private int maxSearchDepth = 0;
    
    public Node(Type newData) {
        _data = (int[][]) newData;
    }

    //Method addChildren
    
    
    
    
    
    /**
     * @return the _parent
     */
    public Node<int[][]> getParent() {
        return _parent;
    }

    /**
     * @param _parent the _parent to set
     */
    public void setParent(Node<int[][]> _parent) {
        this._parent = _parent;
    }

    /**
     * @return the _children
     */
    public List<Node<Type>> getChildren() {
        return _children;
    }

    /**
     * @param _children the _children to set
     */
    public void setChildren(List<Node<Type>> _children) {
        this._children = _children;
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
    
    
}
