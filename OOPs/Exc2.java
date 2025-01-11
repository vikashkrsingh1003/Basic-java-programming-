// command line Argumen and Multiple catch 

class Exc2 {
    public static void main(String args[]){
    
 int n =0;


try{
n = Integer.parseInt(args[0]);
if ( n < 0){
NegativeException x = new NegativeException("Negative number Exeption occur");
throw x;
}
}
catch(ArrayIndexOutOfBoundsException ae){
System.out.println("please Enter At Least one Argument from comman line");
}
catch(NumberFormatException ne){
System.out.println("Plase enter only Numberic value");
}
catch(NegativeException y){
System.out.println(y.getMsg());
}
System.out.println("Square is: " + Math.pow(n,2));
}

}