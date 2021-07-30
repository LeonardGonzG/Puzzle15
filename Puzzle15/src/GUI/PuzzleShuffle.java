/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author David Clavijo
 */
public class PuzzleShuffle {

    
    
    public PuzzleShuffle() {
    }

  
    public int[][] RandomMatrix (){
         ArrayList<Integer> blockNums = new ArrayList<>();
               
        for (int i=0 ;i<16;i++){
                    blockNums.add(i);
                }
     
                Collections.shuffle(blockNums);
                
                int[][] Xatrix = new int[4][4];
                int cont = 0;
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        Xatrix[i][j]=blockNums.indexOf(cont);
                        cont+=1;
                    }
                }
        return Xatrix;
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