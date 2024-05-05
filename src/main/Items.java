package main;
import java.util.ArrayList;
import java.util.Random;

public class Items {
    private ArrayList<Item> items;

    public ArrayList<Item> getItemList() {
        try {
            if(items != null) 
                return items;
            else 
                throw new NullPointerException("Items list is null");
        } catch(NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
            return new ArrayList<Item>();
        }
    }

    public void fillItems() {
        ArrayList<Item> itemList = new ArrayList<>();

        String[] name = {"happy", "sad", "cute", "curious", "angry", "bored"};
        String[] type = {"clothing", "accessories", "heads"};

        String tempName = "";
        String tempType = "";

        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            int randomIndexName = rand.nextInt(name.length);
            int randomIndexType = rand.nextInt(type.length);

            tempName = name[randomIndexName];
            tempType = type[randomIndexType];

            Item temp = new Item(tempName, tempType);

            itemList.add(temp);
        }

        items = itemList; 
    }
}

class Item {
    public String name;
    public String type;

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

