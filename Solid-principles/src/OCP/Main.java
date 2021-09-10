package OCP;

class OCP_main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(10,5);
        Subtraction sub = new Subtraction(10,5);
        Multiplication mul = new Multiplication(10,5);
        calci.calculate(add);
        System.out.println("result: "+add.sum);
        calci.calculate(sub);
        System.out.println("result:  "+sub.difference);
        calci.calculate(mul);
        System.out.println("result:  "+mul.product);

    }
}