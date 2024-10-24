//Create an object called "myObj" and print the value of x:

/*public class Main {
    int x = 5;
  
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
    }
  }*/
  
  // Create two objects of Main:
  public class Main {
    int x = 5;
  
    public static void main(String[] args) {
      Main myObj1 = new Main();  
      Main myObj2 = new Main();  
      System.out.println(myObj1.x);
      System.out.println(myObj2.x);
    }
  }