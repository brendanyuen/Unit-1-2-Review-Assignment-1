class Question3{
    
 public static void main(String[] args) {
     int sum=0;
     int nsum=0;
     for(int i=1; i<=100; i++){
         nsum+=i*i;
         
         sum=sum+i;
        }
     
     System.out.println(sum*sum-nsum);
    }
    
    
}