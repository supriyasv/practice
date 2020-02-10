public class A {
    private int var = 50;

    public int getVar(){
        return var;
    }

    public void setVar(int var){
        if(var>1000){
            this.var=0;
        }
        else{
            this.var=var;
        }
    }
}
