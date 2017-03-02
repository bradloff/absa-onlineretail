package za.co.absa.filter.route;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by barry on 2017/01/11.
 */
@Component
public class ZuulRouteFilter extends ZuulFilter{


    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("=========  Route filter being called ===========");
        RequestContext ctx = RequestContext.getCurrentContext();
        String service = ctx.get("serviceId").toString();
        System.out.printf("Service ID [%s]\n", service);
        if(service.equals( "inventory-service")){
            System.out.printf("Found inventory, now checking URL: %b\n", ctx.getRequest().getRequestURL().toString().endsWith("bbc"));
            if ( ctx.getRequest().getRequestURL().toString().endsWith("bbc")){
                System.out.println("going to the BBC!!!!");
                String altHost = "http://bbc.co.uk";
                try {
                    ctx.setRouteHost(new URL(altHost));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }

        }
        return null;
    }
}
