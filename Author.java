public class Author
{
 public String DOB;
 public String name;

 Author (String birth, String named){
     DOB = birth;
     name = named;
 }

 public String getCreator (){
    return name;
 }

 public String getDOB (){
    return DOB;
 }

}
