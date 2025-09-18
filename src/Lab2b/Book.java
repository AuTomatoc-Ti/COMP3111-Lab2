package Lab2b;
/* Comp3111L-Lab2/Lab2b/Book.java */

import java.util.Arrays;

public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;
    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++)
            chapters[i] = "n/a";
    }
    public Book(String argument[]) {
        /* construct the object with an array of chapter names */
        /* PLEASE ADD YOUR CODE HERE */
        chapters = new String[DEFAULT_CHAPTERS];
        //System.out.println(argument.length);
        for  (int i = 0; i < chapters.length; i++)
            chapters[i] = "n/a";

        for (int i = 0; i < chapters.length &&  i < argument.length; i++){
            /*check if the argument goes to end)  */
            //System.out.println(argument[i]);

            chapters[i] = argument[i];
        }


    }
    public String getChapter(int i) {
        /* return the chapter by the given index */
        /* PLEASE ADD YOUR CODE HERE */
        return chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}
