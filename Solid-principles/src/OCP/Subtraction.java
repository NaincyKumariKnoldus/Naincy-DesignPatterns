package OCP;

public class Subtraction implements Operation{
    public double first_num;
    public double second_num;
    public double difference=0.0;

    public Subtraction(double first_num, double second_num){
        this.first_num = first_num;
        this.second_num = second_num;
    }
    // overriding perform method
    public void perform(){
        this.difference = this.first_num - this.second_num;
    }
}