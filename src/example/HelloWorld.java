package example;

import javax.ws.rs.Path;

/**
 * Created by HP on 10/10/2015.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests
//    @GET
//    // The Java method will produce content identified by the MIME Media type "text/plain"
//    @Produces("text/plain")
//    public String getClichedMessage() {
//        // Return some cliched textual content
//        return "Hello World";
//    }
//
//    public static void main(String[] args) throws IOException {
//        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
//        server.start();
//
//        System.out.println("Server running");
//        System.out.println("Visit: http://localhost:9998/helloworld");
//        System.out.println("Hit return to stop...");
//        System.in.read();
//        System.out.println("Stopping server");
//        server.stop(0);
//        System.out.println("Server stopped");
//    }
}
