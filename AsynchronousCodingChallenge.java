package Week2Monday;
import java.util.*;
import java.util.Arrays;
import java.io.*;

public class AsynchronousCodingChallenge {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int m = a.length;
        // this loop reverses the integer string
        for(int i = 0; i < 5; i++){

            int temp = a[m-1-i];
            a[m-1-i] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));

        // this loop reverses letters of the names and the postion of the names
        String[] names = {"Luke", "Han", "Leia", "Chewie","Vader","Tarkin", "Lando"};
        int n = names.length;

        // reverses the positions of words
        for(int i = 0; i < n-2; i++){

            String temp2 = names[n-1-i];
            names[n-1-i] = names[i];
            names[i] = temp2;
        }

        // reverses the letters
        for (int i = 0; i < n; i++){
            StringBuffer sbr = new StringBuffer(names[i]);
            sbr.reverse();
            System.out.println(sbr);

        }


    }

}
