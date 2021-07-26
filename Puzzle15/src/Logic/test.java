/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author leogonz.gut
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puzzle15 ok = new Puzzle15();

        int[][] testMatriz = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };

        showMatriz(testMatriz);

        
        ArrayList<int[][]> listA = ok.childParent(new Node(testMatriz));
        
        for(int x=0; x<listA.size(); x++){
            
          showMatriz(listA.get(x)); 
         System.out.println("================================");
        }

    }

    public static void showMatriz(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("\t" + m[i][j]);
            }
        }
        System.out.println("");

    }

}
