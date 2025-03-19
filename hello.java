package HelloWorld;

class Add{
    /**
     *
     */
    int a=120,b=990;
    int sum=0;
    int add(){
        sum=a+b;
        System.out.println("Addition: "+sum);
        return sum;
    }

}

public class hello {
    public static void main(String[] args) {
        Add a1=new Add();
        a1.add();
    }
    
}
