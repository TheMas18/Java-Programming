package Practice;

import java.io.PrintWriter;

//public class HelloWorld {
//    public static void main(String[] args) throws java.io.IOException {
//        byte[] helloWorldBytes = "Hello, World!".getBytes();
//        System.out.write(helloWorldBytes, 0, helloWorldBytes.length);
//    }
//}
public class HelloWorld {
    public static void main(String[] args) {
//        PrintWriter out = new PrintWriter(System.out, false);
//        out.print("Hello, World!");
//        out.flush();
    	System.out.println(square(5));
    	
    }
    public static int square(int n){
        int ans=0;
        while(n>0){
            int r=n%10;
            ans+=r*r;
            n=n/10;

        }
        return ans;
    }
}