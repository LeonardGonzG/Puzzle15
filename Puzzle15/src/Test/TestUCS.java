/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Logic.IntelligentSystem;
import Logic.Node;

/**
 *
 * @author leogonz.gut
 */
public class TestUCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IntelligentSystem agend = new IntelligentSystem();

        int[][] initState = {
            {1, 15, 8, 10},
            {0, 3, 9, 14},
            {4, 7, 12, 11},
            {5, 2, 13, 6}
        };
//        int[][] initState = {
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 0, 11, 12},
//            {13, 10, 14, 15}
//        };
//        
//         int[][] initState = {
//            {1, 2, 3, 4},
//            {0, 6, 7, 8},
//            {5, 10, 11, 12},
//            {9, 13, 14, 15}
//        };
//        int[][] initState = {
//            {0, 1, 2},
//            {3, 4, 5},
//            {6, 7, 8}
//        };
//        int[][] initState = {
//            {2, 8, 3},
//            {1, 6, 4},
//            {7, 0, 5}
//        };
//        int[][] initState = {
//            {1, 0, 3},
//            {5, 2, 6},
//            {4, 7, 8}
//        };
//        int[][] initState = {
//            {1, 2, 3},
//            {0, 5, 6},
//            {4, 7, 8}
////        };
        int[][] finalState = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
        };
//         int[][] finalState = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 0}
//        };
//        int[][] initState = {
//            {0, 2},
//            {1, 3}
//        };
//
//        int[][] finalState = {
//            {1, 2},
//            {3, 0}
//
//        };
           
        

        System.out.println("Uniform Cost Search - UCS");

        Node nodeSolved = agend.UniformCostSearch(initState, finalState);

        int cont = 0;
        if (nodeSolved != null) {
            while (nodeSolved != null) {

                cont++;
                showMatriz(nodeSolved.getData());
                nodeSolved = nodeSolved.getParent();
            }

        } else {

            System.out.println("Falla! :(");
        }

        System.out.println("Pasos: " + cont);

    }

    private static void showMatriz(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("\t" + m[i][j]);
            }
        }
        System.out.println("");

    }

}
