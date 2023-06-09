package org.quarkusapplication.login;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class LoginApplication {

    public static void main(String... args) {
        Quarkus.run(args);
    }
}