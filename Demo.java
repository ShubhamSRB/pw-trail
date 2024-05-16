 /*METHOD OF OVERLODING =  java main method name same ho
  salkta hai but parameter
shuold be dffirent this parameter same to 
data type should be dffirent = compiletime polymorphism*/
class Calc
{
    public int add( int n1,int n2)
    {
        int result= n1 * n2;
        return result;
    } 
    public int add( int n1,int n2,int n3)
    {
        int result= n1 + n2 + n3;
        return result;
    } 
    public double add( double n1,double n2)
    {
        double result= n1 / n2;
        return result;
    } 
    public String add(String name,int a)
    {
       String  s = name;
        int t = a;
       //return t; = error because return type is String
        return s;
    }
  
 }
public class Demo {
    public static void main(String []args)
    {
        Calc obj = new Calc();
        int result = obj.add(4,3);
        int res1 = obj.add(4,3,2);
        double res2 = obj.add(1.5,2.5);
        System.out.println(res1);
        System.out.println(result);
        System.out.println(res2);
        System.out.println(obj.add("shubham",65));

    }
    
}
