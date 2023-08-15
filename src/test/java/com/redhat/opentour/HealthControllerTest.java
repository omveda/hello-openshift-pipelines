package com.redhat.opentour;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import io.javalin.http.Context;

public class HealthControllerTest {

    Context ctx = mock(Context.class);

    @Test
    public void testHello() {
        String expected = "UP";

        HealthController.health(ctx);
        verify(ctx).result(expected);
    }
}
