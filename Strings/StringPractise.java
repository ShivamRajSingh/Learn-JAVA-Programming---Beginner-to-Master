class StringPractise {
    public static void main(String[] args) {
        char c[] = {'a','e','i','o','u'};
        String s = new String(c);
        System.out.println(s);

        byte b[] = {97,98,99,100};
        String st = new String (b);
        System.out.println(st);

        String str = "Java Program";
        System.out.println(str);

        int i = str.length();
        System.out.println("Length : " + i);

        String str1 = str.toLowerCase();
        System.out.println(str1);

        String str2 = str.toUpperCase();
        System.out.println(str2);


        String str3 = "     Java Program       ";
        str3 = str3.trim(); // removes whitespaces
        System.out.println(str3);

        String str4 = str.substring(5);
        System.out.println(str4);

        String str5 = str.substring(0,4);
        System.out.println(str5);

        String str6 = str.replace('a','e');
        System.out.println(str6);

        String str7 = "Hello";
        String str8 = "Hello";
        String str9 = "hello";
        String str10 = new String ("Hello");

        System.out.println(str7 == str8);
        System.out.println(str7.equals(str8));

        System.out.println(str7.equals(str9));
        System.out.println(str7.equalsIgnoreCase(str9));

        System.out.println(str7 == str10);
        System.out.println(str7.equals(str10));

        String str11 = "JAVA";
        String str12 = "java";
        String str13 = "python";

        System.out.println(str11.compareTo(str12));
        System.out.println(str12.compareTo(str13));
        System.out.println(str11.compareToIgnoreCase(str12));

        String str14 = "Great Wall of China !";
        System.out.println(str14.contains("wall"));
        System.out.println(str14.contains("Wall"));

        String str15 = "Hello, ";
        String str16 = "Mr. X";
        System.out.println(str15.concat(str16));
        System.out.println(str15 + str16);

    }
}
