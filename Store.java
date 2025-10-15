/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store
{

public double profit;
 private ArrayList <ItemForSale> items = new ArrayList <ItemForSale> ();


 //pre-condition: items has been initalized and has values
 //post-condition: items returned in a list 
 public ArrayList <ItemForSale> showItems (){
  System.out.println(items);
  return items;
}

// pre-condition: items has been initalized
//post-condition: items has an added value to the end of the list
 public void addItems (ItemForSale newOne){
  items.add(newOne);
 }


 // pre-condition: ItemForSale has values within and has been initalized
//post-condition: items loses a value and profit is increased
 public void sell (ItemForSale ites){
  items.remove(ites);
  profit += ites.getPrice();
 }


 public String creator (String name){
  return name;
 }

 public double getProfit (){
    return profit;
 }

}
