package com.company;


import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
	// write your code here

        Socket socket = new Socket("127.0.0.1", 136); //connect to server
                PrintStream out = new PrintStream(socket.getOutputStream());
        System.out.println("[!]Connected");

        System.out.println("[1] Create join code [2] Join");

        Scanner usrin = new Scanner(System.in);
        String in = usrin.nextLine();



        if (in.equals("1")) {

            int Code = 0;

            System.out.println("Your code is:" + Code);

        } else if (in.equals("2")) {

            System.out.println("Please enter join code: ");
            Scanner joincode = new Scanner(System.in);

            System.out.println(joincode);
        } else {

            System.out.println("Huh? please try agian");
            Thread.sleep(200);



        }

        System.out.println(in);




        String srvun = "Failed on client end";

        out.println(srvun);




    }
}
