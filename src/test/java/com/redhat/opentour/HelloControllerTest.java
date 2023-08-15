package com.redhat.opentour;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import io.javalin.http.Context;

public class HelloControllerTest {

    Context ctx = mock(Context.class);

    @Test
    public void testHello() {
        String expected = "Hello world";

        HelloController.sayHello(ctx);
        verify(ctx).result(startsWith(expected));
    }
}
