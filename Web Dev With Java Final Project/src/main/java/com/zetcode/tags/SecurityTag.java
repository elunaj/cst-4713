package com.zetcode.tags;
import javax.servlet.jsp.tagext.*;

import static com.zetcode.util.ReadData.getFile;

import javax.servlet.jsp.*;
import java.io.*;

public class SecurityTag extends SimpleTagSupport {
   
	private String id = "____security";
	private float minutes = .25f;
	
	public void setId(String id) { 
		this.id = id;
	}

	public void setMinutes(float minutes) {
		this.minutes = minutes;
	}

	public void doTag() throws JspException, IOException {
      JspWriter out = getJspContext().getOut();
      
      String js = getFile(SecurityTag.class, "SecurityTag.js");
      js = js.replace("$id$", id)
    		 .replace("$minutes$", String.valueOf(minutes));
      
      out.println(js);
   }
}