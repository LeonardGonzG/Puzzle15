package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogonz.gut
 */
public class IntelligentSystem {

    
    private int steps = 0;
    private ArrayList<int[][]> path = new ArrayList<>();
    private Node nodeSolved  = null;        
    
    public IntelligentSystem() {

    }

    public ArrayList<int[][]> showPath(int[][] initState, int[][] finalState) {
       
        this.nodeSolved = UniformCostSearch(initState, finalState);

        int cont = 0;
        
        if (getNodeSolved() != null) {
            while (getNodeSolved() != null) {

                this.steps++;
                getPath().add(this.getNodeSolved().getData());
                this.nodeSolved = this.getNodeSolved().getParent();
            }

        } else {

            System.out.println("Falla! :(");
            return null;
        }

        return this.getPath();
    }

    public Node UniformCostSearch(int[][] initState, int[][] finalState) {

        Puzzle15 actionPuzzle = new Puzzle15();

        Node iniNode = new Node(initState);
        Node finalNode = new Node(finalState);
        List<Node> frontier = new ArrayList<>();
        List<Node> visited = new ArrayList<>();
        Node curNode = null;
        List<Node> children = null;

        frontier.add(iniNode);

        while (!frontier.isEmpty()) {

            System.out.println("Frontier size: " + frontier.size());
            frontier = MethodBubbleOrder(frontier);
            curNode = frontier.remove(0);
            if (equalsData(curNode.getData(), finalNode.getData())) {
                return curNode;
            }
            visited.add(curNode);

            System.out.println("Visisted size: " + visited.size());
            
            if(visited.size() > 10000){
                return null;
            
            }
            
            
            curNode.addChildren(actionPuzzle.childParent(curNode), finalState);
            children = curNode.getChildren();

            for (Node node : children) {

                if (!exist(visited, node)) {

                    if (exist(frontier, node)) {

                        frontier = costPathNodes(node, frontier);

                    } else {
                        frontier.add(node);
                    }
                }

            }

        }

        return null;
    }

    public List<Node> MethodBubbleOrder(List<Node> frontier) {

        Node aux;
        List<Node> arrayOrder;

        for (int i = 0; i < frontier.size() - 1; i++) {
            for (int j = 0; j < frontier.size() - i - 1; j++) {

                if (frontier.get(j).getCosthPath() > frontier.get(j + 1).getCosthPath()) {

                    aux = frontier.get(j);
                    frontier.set(j, frontier.get(j + 1));
                    frontier.set(j + 1, aux);
                }

            }
        }

        arrayOrder = frontier;
        return arrayOrder;
    }

    public boolean equalsData(int[][] dataCurrent, int[][] finalState) {

        for (int i = 0; i < dataCurrent.length; i++) {
            for (int j = 0; j < finalState.length; j++) {

                if (dataCurrent[i][j] != finalState[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean exist(List<Node> list, Node curNode) {

        for (Node node : list) {
            if (equalsData(node.getData(), curNode.getData())) {
                return true;
            }

        }

        return false;
    }

    public List<Node> costPathNodes(Node curNode, List<Node> frontierList) {

        boolean flat = false;

        for (int i = 0; i < frontierList.size(); i++) {

            if (curNode.getCosthPath() < frontierList.get(i).getCosthPath() && !flat) {

                //   System.out.println("Cost Node: " +curNode.getCosthPath() + " Nodes: " + frontierList.get(i).getCosthPath());
                frontierList.set(i, curNode);
                flat = true;
            }

            if (curNode.getCosthPath() < frontierList.get(i).getCosthPath() && flat) {
                frontierList.remove(i);
            }
        }

        return frontierList;

    }
    /*
    public List<Node> costPathNodes(Node curNode, List<Node> frontierList) {

        for (Node node : frontierList) {

            if (curNode.getCosthPath() < node.getCosthPath()) {
               
                System.out.println("Costh CurNode: " + curNode.getCosthPath() + "other node: "+node.getCosthPath());
                frontierList.clear();
                frontierList.add(curNode);

                return frontierList;
            }

        }
        return frontierList;

    }*/

    /**
     * @return the steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * @return the path
     */
    public ArrayList<int[][]> getPath() {
        return path;
    }

    /**
     * @return the nodeSolved
     */
    public Node getNodeSolved() {
        return nodeSolved;
    }
    
    

}
