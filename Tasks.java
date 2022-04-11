public class Tasks{
  private String name;
  public String description;

  //Constructor
  public Tasks(String name, String description){
    this.name = name;
    this.description = description;
  }

  //Getter
  public String getName(){
    return this.name;
  }

  //Setter
  // public void setName(String name){
  // this.name = name;
  //}
  
  public String showTask(){
    return "Nombre = " + this.getName() + "; Descripcion = " + this.description;
  }
  
}