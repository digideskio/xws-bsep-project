package util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class Logger {

  		
  @AroundInvoke
  public Object logEvent(InvocationContext ctx) throws Exception {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");  
	try{	
      String parameters = "(";
	  for (Object obj : ctx.getParameters()) {
		  parameters += obj.toString() + ", ";
	  }
	  parameters += ")";
	  System.out.println("["+sdf.format(new Date()) + "] Class name: " + ctx.getTarget().getClass() + ", method name: " + ctx.getMethod() + ", parameters: " + parameters + " started");	  
	  return ctx.proceed();
	}catch(Exception e){
		System.out.print("["+sdf.format(new Date()) + "] Class name: " + ctx.getTarget().getClass() + ", method name: " + ctx.getMethod());
		e.printStackTrace();
		throw e;
	}finally {
		System.out.println("["+sdf.format(new Date()) + "] Class name: " + ctx.getTarget().getClass() + ", method name: " + ctx.getMethod() + " finished");
	}
  }
}
