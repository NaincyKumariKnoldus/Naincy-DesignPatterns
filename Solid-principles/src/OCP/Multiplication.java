package OCP;

public class Multiplication implements Operation{
    public double first_num;
    public double second_num;
    public double product=0.0;

    public Multiplication(double first_num, double second_num){
        this.first_num = first_num;
        this.second_num = second_num;
    }
    // overriding perform method
    public void perform(){
        this.product = this.first_num * this.second_num;
    }
}