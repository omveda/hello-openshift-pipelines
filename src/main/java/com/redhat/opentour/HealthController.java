package com.redhat.opentour;

import io.javalin.http.Context;

public class HealthController {

    public static void health(Context ctx) {
        ctx.result("UP");
    };

}
