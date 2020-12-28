package com.xishan.store.portal.portalweb;

import com.xishan.store.usercenter.userweb.UserWebAutoStarterAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({UserWebAutoStarterAutoConfiguration.class})//装配
public class PortalConfiguration {
}
