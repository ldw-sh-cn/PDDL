package io.pddl.exception;

@SuppressWarnings("serial")
public class ShardingException extends RuntimeException{

	public ShardingException(String message){
		super(message);
	}
	
	public ShardingException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public ShardingException(Throwable cause) {
        super(cause);
    }
	
    public ShardingException(final String errorMessage, final Object... args) {
        super(String.format(errorMessage, args));
    }
	
	public void handle(){}
	
}
