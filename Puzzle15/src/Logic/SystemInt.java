package Logic;

import java.util.ArrayList;

/**
 *
 * @author leogonz.gut
 */
public class SystemInt {

    int spotA = 0;
    int spotB = 0;

    public SystemInt() {
    }

    public ArrayList<int[][]> childParent(Node parent) {

        ArrayList<int[][]> child = new ArrayList();
        showSpace(parent);
        int[][] copyParent = copyParent(parent.getData());

        int aux[][] = copyParent(parent.getData());
        int col = 0;
        int row = 0;

        //Move right
        col = spotB + 1;
        if (spotB != 3) {

            aux[spotA][spotB] = copyParent[spotA][col];
            aux[spotA][col] = 0;          
            child.add(aux);

        }

        aux = copyParent(parent.getData());
        //Move left
        col = spotB - 1;
        if (spotB != 0) {
            aux[spotA][spotB] = copyParent[spotA][col];
            aux[spotA][col] = 0;
            child.add(aux);

        }

        aux = copyParent(parent.getData());
        //Move above
        row = spotA - 1;
        if (spotA != 0) {
            aux[spotA][spotB] = copyParent[row][spotB];
            aux[row][spotB] = 0;
            child.add(aux);
        }

        aux = copyParent(parent.getData());
        //Move down
        row = spotA + 1;
        if (spotA != 3) {
            aux[spotA][spotB] = copyParent[row][spotB];
            aux[row][spotB] = 0;
            child.add(aux);
        }

        return child;
    }

    private void showSpace(Node parent) {

        for (int i = 0; i < parent.getData().length; i++) {
            for (int j = 0; j < parent.getData()[0].length; j++) {
                if (parent.getData()[i][j] == 0) {
                    spotA = i;
                    spotB = j;

                }
            }
        }

       // System.out.println("" + spotA + "," + spotB);
    }

    public int[][] copyParent(int[][] data) {

        int[][] copy = new int[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {

                copy[i][j] = data[i][j];

            }

        }
        return copy;

    }

}
