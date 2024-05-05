package main;

import java.util.ArrayList;

/* Site Logic
 * User has one stack of cards drawn from universal stack
 * Card stack are 
 *      Clothes     
 *      Accessories
 *      Heads
 */


class index {
    public static void main(String[] args) {
        // Init original user
        int[][] data = new int[0][0];
        User user = new User("Tom", 25, data);

        // Init database
        Items items = new Items();
        items.fillItems();
        items.getItemList();
        ArrayList<Item> itemList = items.getItemList();

        // Begin regular use / recommendation training
    }
}
