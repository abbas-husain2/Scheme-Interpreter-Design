package visitor;

import syntaxtree.Expression;

import java.util.ArrayList;

public interface ReturnableValue {
    void show();

}
class IntegerType implements ReturnableValue{

    Integer objectInteger;
    public void show(){
        System.out.println(objectInteger);
    }

}

class BooleanType implements ReturnableValue{
    String name;
    public void show(){
        System.out.println(name);
    }


}

class Procedure implements ReturnableValue{
    Environment env;
    ArrayList<String> arr=new ArrayList<>(10000000);
    String name;
    Expression statements;
    public void show() {


        System.out.print("<procedure: lambda (");
        int i;
        for(i=0;i<arr.size()-1;i++){
            System.out.print(arr.get(i)+" ");
        }


        System.out.print(arr.get(i)+")>");


    }

}
class IntegerList implements ReturnableValue{
    ArrayList<Integer> array
            = new ArrayList<Integer>(10000000);
    public void show(){
        System.out.print("(");
        int i;
        for(i=0;i<array.size()-1;i++){
            System.out.print(array.get(i)+" ");
        }
        System.out.print(array.get(i)+")");
    }
}