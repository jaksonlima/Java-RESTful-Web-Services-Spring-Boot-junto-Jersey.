package rest.api.util;

import org.springframework.util.AntPathMatcher;

public class Utils {

    public static AntPathMatcher anatPathMatcher(){
        return new AntPathMatcher();
    }
}
