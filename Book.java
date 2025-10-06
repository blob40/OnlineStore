
public class Book extends ItemForSale
{

public String name;
public String publisher;


public Book(String named, Double money, String Day) {
        super(named, money, Day);
        name = named;
    }

public String getBookName (){
    return name;
}

public String getPublisher (){
    return publisher;
}


}
