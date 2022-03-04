public class Multiplication {
    public static void main(String[] args) {
      NewProcess obj = new NewProcess();
        System.out.println(obj.multiply(2,4));
    }
}
class NewProcess{
    int multiply(int a , int b){
        return a*b;
    }
}
