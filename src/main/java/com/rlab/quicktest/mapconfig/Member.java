package com.rlab.quicktest.mapconfig;

import com.hazelcast.core.Client;
import com.hazelcast.core.ClientListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class Member {

    public static void main(String args[]){

        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

        hazelcastInstance.getClientService().addClientListener(new ClientListener() {

            public void clientConnected(Client client) {
                System.out.println("Client Connected "+client.getUuid());
            }

            public void clientDisconnected(Client client) {

            }
        });
    }

}
