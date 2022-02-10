public class CountWords {
    public static void main(String[] args) {
        String str = "  abc     def     gh ij";
        str = str.replaceAll("\\s+", " ").trim(); // it will remove all the extra spaces and whitespaces.
        String []words = str.split("\\s");
        System.out.println("No. of words : " + words.length);
        
    }
}
