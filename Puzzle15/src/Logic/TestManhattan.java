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
public class TestManhattan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       /* 
        int[][] initState = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 5, 8}
        };
        
        */
//       int[][] initState = {
//            {1, 0, 3},
//            {4, 2, 6},
//            {7, 5, 8}
//        };
//
//        int[][] finalState = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 0}
//        };
//        
        
         int[][] initState = {
            {1, 15, 8, 10},
            {0, 3, 9, 14},
            {4, 7, 12, 11},
            {5, 2, 13, 6}
        };
         
           int[][] finalState = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
        };

        
        Node test = new Node(initState);
        
        int resp = test.calculateCostPath(test, finalState);
        
        System.out.println("Distance Manhattan: "+ resp);
        
        
    }
    
}
