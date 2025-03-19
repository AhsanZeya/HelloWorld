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

class Sub{
    /**
     *
     */
    int a=120,b=990;
    int minus=0;
    int add(){
        minus=a-b;
        System.out.println("Addition: "+minus);
        return minus;
    }

}

class Mul{
    /**
     *
     */
    int a=120,b=990;
    int minus=1;
    int add(){
        minus=a*b;
        System.out.println("Addition: "+minus);
        return minus;
    }

}

public class hello {
    public static void main(String[] args) {
        Add a1=new Add();
        a1.add();
        Sub s1=new Sub();
        s1.add();
        Mul m1=new Mul();
        m1.add();
    }
    
}
