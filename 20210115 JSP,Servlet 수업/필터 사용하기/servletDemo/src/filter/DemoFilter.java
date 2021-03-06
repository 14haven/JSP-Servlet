package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class DemoFilter
 */
public class DemoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DemoFilter() {
        // TODO Auto-generated constructor stub
    	System.out.println("필터 생성자");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filter destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("doFilter");
		System.out.println("chain 이전");
		
		request.setCharacterEncoding("UTF-8");
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("chain 이후");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("필터 init");
	}

}
