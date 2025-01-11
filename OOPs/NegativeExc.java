//user defined user class or customized exception class 

  class NegativeExc extends Throwable{
   
  private String msg;

public NegativeExc(String msg){

this.msg= msg;
}

  public static getMsg(){
  return msg;
}
}