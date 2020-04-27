package com.company;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;

public class SVR {
    public static void main(String[] args) throws IOException {
        String code, temp;



            ServerSocket s1 = new ServerSocket(136); // Host on this port

            Socket ss = s1.accept();// accept incoming packets
            Scanner sc = new Scanner(ss.getInputStream()); // read from socket
            code = sc.next();

            temp = code;

            System.out.println(temp);



        }




}

