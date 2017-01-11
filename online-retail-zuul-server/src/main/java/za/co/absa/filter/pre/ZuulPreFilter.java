package za.co.absa.filter.pre;

import com.netflix.zuul.ZuulFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.absa.filter.Util;

import java.util.Date;

/**
 * Created by barry on 2017/01/11.
 */
@Component
public class ZuulPreFilter extends ZuulFilter {

    @Autowired
    Util utils;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10; //I run 10th in line
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        String ts = utils.getRequestHeader("osl-pre-timestamp");
        if (ts == null) {
            ts = new Date().toString();
            utils.setRequestHeader("osl-pre-timestamp", ts);
        }
        System.out.printf(" *** *** MyPreFilter intercepted request at %s *** *** \n", ts);
        return null;
    }
}
