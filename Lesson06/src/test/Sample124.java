package test;

public class Sample124 {

  public static void main(String[] args) {
    char[] charList = {'J', 'a', 'v', 'a'};      
    String text = " JAVA "; 
    String text2, text3, text4;

    text2 = new String(charList);
    text3 = new String("Java Programming");
    text4 = "java";
    
    System.out.println("text:" + text);
    System.out.println("text2:" + text2);
    System.out.println("text3:" + text3);
    System.out.println("text4:" + text4);

//    System.out.println("text length:"+text.length());
//    System.out.println("text length:"+text2.length());
//    System.out.println(text2.toLowerCase());
//    System.out.println(text2.toUpperCase());
//
//    System.out.println(text3.indexOf("gram"));
//    System.out.println(text3.lastIndexOf('b', 2));
//
//    System.out.println(text.charAt(3));
//    System.out.println(text3.substring(2, 6));
//    System.out.println(text2.replace('a','b'));
//    System.out.println(text.trim());
//    System.out.println(text.concat(text2));
//    System.out.println(text + text2);
//
    System.out.println(text2.compareTo(text4));
    System.out.println(text2.compareToIgnoreCase(text4));

    System.out.println(text2.equals(text4));
    System.out.println(text2.equalsIgnoreCase(text4));

    System.out.println(text2.startsWith("J"));
    System.out.println(text2.endsWith("a"));
  }

}
