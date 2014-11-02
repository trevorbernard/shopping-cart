package io.txb.shoppingcart;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
  public static void main(String[] args) throws Exception {
    String webPort = System.getenv("PORT");
    if (webPort == null || webPort.isEmpty()) {
      webPort = "8080";
    }

    final Server server = new Server(Integer.valueOf(webPort));
    final WebAppContext root = new WebAppContext();

    root.setContextPath("/");
    root.setParentLoaderPriority(true);

    final String webappDirLocation = "src/main/webapp/";
    root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
    root.setResourceBase(webappDirLocation);

    server.setHandler(root);

    server.start();
    server.join();
  }
}
