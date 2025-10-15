//Alex Krouse
//October 10 2025
//Online store that returns sellable and item inventory as well as gives profit amounts


public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Author a = new Author("31, july, 1965", "JKR");
        Book b = new Book("Harry Potter", 9.30, "9/30/16");
        

        System.out.println("This book " + b.getBookName() + " is written by " + a.getCreator());
         System.out.println("The author was born on " + a.getDOB());
         System.out.println("$" + b.getPrice());
         System.out.println("It was put on sale on " + b.getDate());
         System.out.println(" ");

         Movie m = new Movie("Maze Runner", 9.10, 120, "6/12/23");
         System.out.println("This moive " + m.getName() + " is " + m.getDur() + " minutes long");
         System.out.println("$" + m.getPrice());
         System.out.println("It was put on sale on " + m.getDate());
         System.out.println(" ");

         s.addItems(m);
         s.addItems(b);
         s.showItems();
         s.sell(m);
         System.out.println ("Total profit " + s.getProfit());
         s.showItems();
         s.sell(b);
         System.out.println ("Total profit " + s.getProfit());
         s.addItems(m);
         s.showItems();
      }
}
