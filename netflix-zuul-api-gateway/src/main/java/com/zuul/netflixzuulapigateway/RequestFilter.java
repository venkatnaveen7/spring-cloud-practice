package com.zuul.netflixzuulapigateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class RequestFilter extends ZuulFilter {

	
	Logger logger= LoggerFactory.getLogger(RequestFilter.class);
	
	@Override
	public Object run() throws ZuulException {
		HttpServletRequest httpServletRequest = RequestContext.getCurrentContext().getRequest();
		logger.info("RequestFilter Request -> {}",httpServletRequest.getContextPath());
		logger.info("URI -> {}",httpServletRequest.getRequestURI());
		logger.info("URL -> {}",httpServletRequest.getRequestURL());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		
		return "pre";
	}

}
