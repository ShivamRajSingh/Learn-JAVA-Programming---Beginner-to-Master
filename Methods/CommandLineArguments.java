public class CommandLineArguments {
    public static void main(String[] args) {
        double sum = 0;
        double temp = 0;
        for(String s : args){
            if(s.matches("[0-9\\.]+")){
                temp = Double.parseDouble(s);
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}
