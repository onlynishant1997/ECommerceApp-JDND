/**
 * 
 */
package com.example.demo.logging.loggingservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The Interface LoggingService.
 *
 * @author Nishant
 */
public interface LoggingService {

	void logRequest(HttpServletRequest httpServletRequest, Object body);

	void logResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object body);
}
