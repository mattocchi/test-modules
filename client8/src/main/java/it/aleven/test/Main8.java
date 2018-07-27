package it.aleven.test;

public class Main8 {

    public static void main(final String[] args) {
        String url = Main8.class.getClassLoader().getResource("test.txt").toExternalForm();
        System.out.println(url);
    }
}
