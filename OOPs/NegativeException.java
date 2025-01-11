// USER DEFINE OR CUSTOMIZE EXCEPTION CLASS
class NegativeException extends Throwable{
private String msg;
public NegativeException(String msg){
this.msg = msg;
}

public String getMsg() {
return msg;
}
}