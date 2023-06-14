package functions;

import io.quarkus.funqy.Funq;
import io.quarkus.logging.Log;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Your Function class
 */
public class Function {

    /**
     * Use the Quarkus Funqy extension for our function. This function simply echoes its input
     * @param input a Java bean
     * @return a Java bean
     */
    @Funq
    public Output function(Input input) {

        // Add business logic here

        return new Output(input.getMessage()+" "+ getAddress());
    }

    private String getAddress(){
        InetAddress addr = null;
        try {
            addr = java.net.InetAddress.getLocalHost();



        } catch (UnknownHostException e) {
            Log.error(e.getMessage());
        }
        return addr.getHostName();
    }

}
