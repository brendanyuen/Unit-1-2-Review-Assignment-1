class Question4{

    public static void main(String[] args) {

        int product =0;

        for(int a=0; a<1000; a++){
            for(int b=0; b<1000; b++){
                double c= (Math.sqrt(a*a+b*b));

                if(a+b+c==1000&&a<b){
                    System.out.println("A = " + a + ", B = " + b + ", C = " + c);
                    System.out.println ("A x B x C" + (a * b * c));
                }

            }
        }
    }
     
}

    
