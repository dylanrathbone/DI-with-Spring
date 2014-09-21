package com.dylanrathbone.interfacesfun;

public class Client
{
        static Datasource datasource;

        public Client(Datasource datasource) {

            this.datasource = datasource;
        }

        public static void callDataSourceMethods() {
            System.out.println(datasource.establishConnection());
            System.out.println(datasource.getConnectionStatus());
            System.out.println(datasource.terminateConnection());
        }
}
