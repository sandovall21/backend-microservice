package com.service.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class TimePostFilter extends ZuulFilter{
	
	private static Logger log = LoggerFactory.getLogger(TimePostFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		log.info("filter post");
		
		Long timeInit = (Long) request.getAttribute("timeInit");
		Long timeFinal = System.currentTimeMillis();
		Long timeTotal = timeFinal - timeInit;
		log.info(String.format("Time total in seconds: %s", timeTotal.doubleValue()/1000.00));
		log.info(String.format("Time total in miliseconds: %s", timeTotal));
		
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
