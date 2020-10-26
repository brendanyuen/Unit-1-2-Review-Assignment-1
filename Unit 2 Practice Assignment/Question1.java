class Question1{
    
 public static void main(String[] args) {
     int n=0;
     for(int i=0;i<1000;i++){
         if(i%5==0 || i%3==0){
             n=n+i;
            }
        }
     
     
     
     System.out.println(n);
    }
    
}