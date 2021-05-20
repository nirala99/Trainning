package example;

import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class LoggerInterceptor implements Interceptor {

    @Override
    public void init() {
        System.out.println("Logger Interceptor Initialized");
    }

    @SuppressWarnings("unchecked")
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String result = "none";
        // pre
        ActionProxy proxy = invocation.getProxy();
        @SuppressWarnings("unused")
        Object currentAction = invocation.getAction();
        System.out.println("Before Action Name " + proxy.getActionName()
                + " for method " + proxy.getMethod() + " in namespace "
                + proxy.getNamespace() + " for class "
                + proxy.getAction().getClass().getName());
        // web framework object
        ActionContext ctx = invocation.getInvocationContext();
        // request Parameters
        Map parameters = ctx.getParameters();
        // context Attributes
        @SuppressWarnings("unused")
        Map ctxAttributes = ctx.getApplication();
        // session attributes
        @SuppressWarnings("unused")
        Map sessionAttributes = ctx.getSession();
        // request object
        @SuppressWarnings("unused")
        HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
        // response object
        @SuppressWarnings("unused")
        HttpServletResponse response = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);
        // context object
        @SuppressWarnings("unused")
        ServletContext servletCtx = (ServletContext) ctx.get(ServletActionContext.SERVLET_CONTEXT);

        if (parameters != null) {
            System.out.println(parameters.size() + " params Sent");
        }

        // actual invocation if the Interceptor/action
        // a. last interceptor: action.method()
        // b. other than last interceptor :nextInterceptor.intercept(invocation)
        result = invocation.invoke();

        // post
        System.out.println("After Action Name " + proxy.getActionName()
                + " for method " + proxy.getMethod() + " with result "
                + result);
        return result;
    }

    @Override
    public void destroy() {
        System.out.println("Logger Interceptor Destroyed");
    }
}
