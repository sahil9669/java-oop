package access;

public class A{
    protected int num;
    private String name;
    public int[] data;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    public A(int num,String name){
        this.num=num;
        this.name=name;
        this.data=new int[num];
    }
}