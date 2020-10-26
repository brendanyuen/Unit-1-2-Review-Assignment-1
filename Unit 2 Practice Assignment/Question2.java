class Question2{
    
 public static void main(String[] args) {
     int sum=0;
     int x=0;
     int y=1;
     for(int i=0; i<4000000; i=x+y){
         if(i%2==0){
             sum=sum+i;
            }
         
            x=y;
            y=i;
        }
     
     System.out.println(sum);
    }
    
    
    
}