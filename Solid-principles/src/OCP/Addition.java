package OCP;

public class Addition implements Operation{
    public double first_num;
    public double second_num;
    public double sum=0.0;

    public Addition(double first_num, double second_num){
        this.first_num = first_num;
        this.second_num = second_num;
    }
    // overriding perform method
    public void perform(){
        this.sum = this.first_num + this.second_num;
    }
}