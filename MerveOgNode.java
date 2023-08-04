/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author merve
 */
public class MerveOgNode {

    int x;
    int data;
    MerveOgNode next;
    MerveOgNode previous;
    MerveOgNode up;
    MerveOgNode down;

    MerveOgNode(int data, int x) {
        this.data = data;
        this.x = x;
        this.next = null;
        this.previous = null;
        this.down = null;
        this.up = null;
    }

}
