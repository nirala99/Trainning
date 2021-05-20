package example;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionOne extends ActionSupport{
	

	String p1;
	String p2;

	String message;

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getMessage() {
		return message; 
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String execute() throws Exception {
		setMessage("-->P1="+getP1()+", P2="+getP2()+"In Action One");
		System.out.println(getMessage());
		return super.execute();
	}
	
	

}
