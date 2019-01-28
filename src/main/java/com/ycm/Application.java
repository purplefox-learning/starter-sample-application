package com.ycm;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();
        app.readInputFromFile();

        HelloWorld hw = new HelloWorld();
        hw.hello("world");
    }

    private void readInputFromFile() {

        //try-with-resource
        try (Scanner scanner = new Scanner(new File("input.txt"));) {

            //we may want to use scanner.hasNext() before nextLine()/next()

            String s1 = scanner.nextLine();
            String[] s1array = s1.split("\\s+");
            for (String s : s1array) System.out.print(s+" ");
            System.out.println();

            String s2 = scanner.nextLine();
            StringTokenizer st2 = new StringTokenizer(s2," ");
            while (st2.hasMoreTokens()) {
                System.out.print(st2.nextToken()+" ");
            }
            System.out.println();

            String s3 = scanner.nextLine();
            StringTokenizer st3 = new StringTokenizer(s3,"+",true);
            while (st3.hasMoreTokens()) {
                System.out.print(st3.nextToken()+" ");
            }
            System.out.println();

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (Exception e) {
            //for now we ignore all exceptions
            e.printStackTrace();
        }

    }
}
