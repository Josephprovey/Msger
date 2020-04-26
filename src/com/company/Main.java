package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, UnknownHostException {
	// write your code here
        Socket socket = new Socket("127.0.0.1", 136); //connect to server
                PrintStream out = new PrintStream(socket.getOutputStream());
        System.out.println("[!]Connected");

        System.out.println("Please enter your username");
        Scanner usrname = new Scanner(System.in);
        String srvun = usrname.nextLine();
        System.out.println(srvun);
        out.println(srvun);




    }
}
