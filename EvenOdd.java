/*public class EvenOdd {
   static  void check(int a){
        if(a%2==0){
            System.err.println("even");
        }
        else{
System.err.println("odd");
        }
    }

public static void main(String args[]){
    int a =6;
    check (a);
}
}*/

//OR

public class EvenOdd {
    static  String check(int a){
         if(a%2==0){
            return "even";
         }
         else{
return "odd";
         }
     }
 
 public static void main(String args[]){
     int a =6;
    System.out.println(check(a)); 
 }
 }
 
 
