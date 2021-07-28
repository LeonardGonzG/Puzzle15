/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

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
        
        int[][] initState ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 0, 15}
        };
        
        int[][] finalState ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
        };
        
        System.out.println("Uniform Cost Search - UCS");
        
         Node nodeSolved = agend.UniformCostSearch(initState, finalState);
         
         while (nodeSolved != null) {
             
            showMatriz(nodeSolved.getData());
            nodeSolved = nodeSolved.getParent();
         }
        
     
        
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
