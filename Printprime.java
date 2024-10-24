public class Printprime {
    static Boolean check(int a){
        if(a<2){
         return false;
        }
        if(a==2){
            return true;
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[]){
        for(int i=0;i<=50;i++){
            if(check(i)){
                System.out.println(i);
        }
    }
}
}