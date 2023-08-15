package com.redhat.opentour;

import io.javalin.Javalin;

public final class App {

    private static final String PORT = System.getenv().getOrDefault("PORT", "8080");

    public static void main(String[] args) {
        new App().startServer();
    }

    private void startServer() {
        Javalin app = Javalin.create().start("0.0.0.0", Integer.parseInt(PORT));

        app.get("/", ctx -> HelloController.sayHello(ctx));
        app.get("/health", ctx -> HealthController.health(ctx));
    }

}
