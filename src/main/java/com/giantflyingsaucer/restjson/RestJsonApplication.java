package com.giantflyingsaucer.restjson;

import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;


@ApplicationPath("/")
public class RestJsonApplication extends PackagesResourceConfig {

    public RestJsonApplication() {
        super("com.giantflyingsaucer.restjson.v1.resources.impl");
    }
}
