package com.hex.demoservice.domain;

import com.hex.demoservice.interfaces.request.DemoRequest;

public interface DemoFactory {

    Demo createDemo(DemoRequest request);

}
