package example;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport{
	//[properties]
	//input
	
	//output
	String message;
	//[methods]
	//signature: public String <methodName>()
	//process
	public String execute(){
		setMessage("Inside Simple Hello Action");
		System.out.println(getMessage());
		//return "success";
		return SUCCESS;// "success -> <result name="<resultValue>">
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
