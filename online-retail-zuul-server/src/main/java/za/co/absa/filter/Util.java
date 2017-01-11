package za.co.absa.filter;

import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
public class Util {

    public String getRequestHeader(String headerName) {
        RequestContext ctx = RequestContext.getCurrentContext();
        String headerValue = ctx.getRequest().getHeader(headerName);

        if (headerValue == null) {
            headerValue = ctx.getZuulRequestHeaders().get(headerName);
        }
        return headerValue;
    }

    public void setRequestHeader(String headerName, String headerValue) {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader(headerName, headerValue);
    }

    public void setResponseHeader(String headerName, String headerValue) {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponse().setHeader(headerName, headerValue);
    }
}