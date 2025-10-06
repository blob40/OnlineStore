public class Movie extends ItemForSale
{
    
public String name;
public int duration;

public Movie(String named, Double money, int dura, String Day) {
        super(named, money, Day);
        duration = dura;
        name = named;
    }


public String getMovieName (){
    return name;
}

public int getDur (){
    return duration;
}

}
