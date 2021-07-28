package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogonz.gut
 */
public class IntelligentSystem {

    public IntelligentSystem() {
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

            curNode.addChildren(actionPuzzle.childParent(curNode), finalState);
            children = curNode.getChildren();

            for (Node node : children) {

                if (exist(frontier, node)) {

                    frontier.clear();
                    frontier = costPathNodes(curNode, frontier);

                } else {
                    frontier.add(node);
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

                if (frontier.get(j).getCosthPath() < frontier.get(j + 1).getCosthPath()) {

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

        for (Node node : frontierList) {

            if (curNode.getCosthPath() > node.getCosthPath()) {
                frontierList.clear();
                frontierList.add(curNode);

                return frontierList;
            }

        }

        return frontierList;

    }

}
