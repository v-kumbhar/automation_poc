package constants;

public enum JSExecutorStatements {
	
	CLICK("arguments[0].click()"),
	SELECT("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }")
	
	;
	public String statement;
	JSExecutorStatements(String statement) {
		this.statement=statement;
	}

}
