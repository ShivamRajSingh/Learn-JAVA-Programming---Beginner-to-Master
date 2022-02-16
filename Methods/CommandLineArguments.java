public class CommandLineArguments {
    public static void main(String[] args) {
        double sum = 0;
        double temp = 0;
        for(String s : args){
            temp = Double.parseDouble(s);
            sum += temp;
        }
        System.out.println(sum);
    }
}
