package example;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionTwo extends ActionSupport {
	String p2;
	String message;

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
		System.out.println("-->>Message : " + getMessage());
		System.out.println("-->>A2 : P2 " + getMessage());
		setMessage(getMessage() + " Also Processing " + getP2()
				+ " InAction Two");
		return super.execute();
	}
}
