/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author merve
 */
public class MerveOgMain {

    public static void main(String[] args) {
        MerveOgLinkedList list = new MerveOgLinkedList();
        list.print(); //At the beginning, list is empty

        //I created an array and filled this array with data and x values.
        int[][] arr2 = {{2, 0}, {2, 3}, {4, 1}, {2, 2}, {4, 4}, {2, 1}, {4, 4}, {8, 0}, {8, 0}, {32, 1}, {2, 2}, {64, 2}, {16, 3}, {64, 1},
        {32, 2}, {16, 0}, {16, 4}, {32, 2}, {64, 1}, {8, 3}, {4, 3}, {2, 3}, {2, 3}, {2, 1}, {64, 2}, {32, 2}, {16, 2}, {8, 2}, {8, 2},
        {4, 1}, {8, 1}};

        //I added the nodes to the list and printed the program. 
        for (int i = 0; i < arr2.length; i++) {
            list.addNode(arr2[i][0], arr2[i][1]);
            list.print();

            //If any column has 7 or more node game will over!
            if (list.countFirstPtr >= 7 || list.countSecondPtr >= 7 || list.countThirdPtr >= 7 || list.countFourthPtr >= 7 || list.countFifthPtr >= 7) {
                System.out.println("Game is over!!!!");
                System.exit(0);
            }
        }

    }

}
