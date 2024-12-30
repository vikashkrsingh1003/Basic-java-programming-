class Pt9{
     public static void main(String args[]){
  
   int r,c;
   
  for (r=1; r<=5; r++){
           
              for (c=5;c>r;c--){
             System.out.print(" ");
}
            
                 for(c=1; c<=r;c++){
                                    if((r+c)%2==0){
                                       System.out.print("0");
}else {
        System.out.print("1");
}
                                      
                        }
System.out.println(" ");
 }

 }
}

       