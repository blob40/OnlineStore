public class ItemForSale
{
public String name;
public Double price;
public String date;

public ItemForSale (String named, Double money, String day){
      name = named;
      price = money;
      date = day;
    
}

public String getName(){
    return name;
}


public Double getPrice () {
    return price;
}

public String getDate(){
    return date;
}
}
