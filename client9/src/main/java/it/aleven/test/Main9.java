package it.aleven.test;

public class Main9 {

    public static void main(final String[] args) {
        String url = Main9.class.getClassLoader().getResource("test.txt").toExternalForm();
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version:" + javaVersion);
        System.out.println(url);
    }
}
