/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leogonz.gut
 */
public class TestMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Puzzle15 ok = new Puzzle15();

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
        */
       
       int[][] testMatriz = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };
       
       IntelligentSystem test = new IntelligentSystem();
       
       List<Node> listNode= new ArrayList<>();
       
       listNode.add(new Node(testMatriz, 9));
       listNode.add(new Node(testMatriz, 6));
       listNode.add(new Node(testMatriz, 1));
       listNode.add(new Node(testMatriz, 2));
       listNode.add(new Node(testMatriz, 8));
       listNode.add(new Node(testMatriz, 5));
       
       List<Node> orderNode = test.MethodBubbleOrder(listNode);
       
       for(Node a : orderNode){
           System.out.println(""+a.getCosthPath());
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
