package com.jdc.springmvcscope.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
@Data
public class SessionScopeBean {
    private int value;

}
