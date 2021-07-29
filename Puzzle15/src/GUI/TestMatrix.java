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
public class TestMatrix {

    public static void main(String[] args){
        
                ArrayList<Integer> blockNums1 = new ArrayList<>();
                ArrayList<Integer> blockNums2 = new ArrayList<>();
                ArrayList<Integer> blockNums3 = new ArrayList<>();
                ArrayList<Integer> blockNums4 = new ArrayList<>();
                
                ArrayList<ArrayList> Puzzle = new ArrayList<ArrayList>();
                
                
                blockNums1.add(1);
                blockNums1.add(2);
                blockNums1.add(3);
                blockNums1.add(4);
                blockNums2.add(5);
                blockNums2.add(6);
                blockNums2.add(7);
                blockNums2.add(8);
                blockNums3.add(9);
                blockNums3.add(10);
                blockNums3.add(11);
                blockNums3.add(12);
                blockNums4.add(13);
                blockNums4.add(14);
                blockNums4.add(15);
                blockNums4.add(0);
                
                Puzzle.add(blockNums1);
                Puzzle.add(blockNums2);
                Puzzle.add(blockNums3);
                Puzzle.add(blockNums4);
                
       // Collections.shuffle(blockNums);
        for(ArrayList obj:Puzzle){

            ArrayList<Integer> temp = obj;

            for(Integer job : temp){
                System.out.print(job+" ");
            }
            System.out.println();
        }
    }
}
