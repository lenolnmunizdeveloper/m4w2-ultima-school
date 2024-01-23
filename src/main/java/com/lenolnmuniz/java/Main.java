package com.lenolnmuniz.java;

import com.lenolnmuniz.java.clients.Client;

public class Main {
    public static void main(String[] args) {
        Client clientOne = new Client("Lenoln",  "B A M", "Muniz", "111.222.333-44",
                "06/03/1997",'M', "lenoln@lenoln.com", "Rua tal, número 123, bairro Tal, cidade Tal/MG",
                "(31) 98922-2771");

        System.out.println(clientOne.toString());

        }
    }

    /*
    * Client(String firstName, String middleName, String lastName, String cpf, String bithday,
                 char gender, String email, String address, String phone)
    * */