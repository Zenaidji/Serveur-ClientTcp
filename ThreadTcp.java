import java.util.*;
import java.net.*;
import java.io.*;

public class ThreadTcp extends Thread {
   public Socket socket;



    public ThreadTcp(Socket socket) {
        this.socket=socket;
    }


    public void run(){
        try {      
       BufferedReader in = new BufferedReader (new InputStreamReader (this.socket.getInputStream()));
      while(true){ 
            String msg=in.readLine();
        for(Socket s :ServeurTcp.ls){
            
            if ((s.isConnected())){
                    PrintWriter out = new PrintWriter(s.getOutputStream());
                    if(msg!=null){
                    out.println(msg);
                    out.flush();
                    }
                    
                    
            }
            else{    
                    ServeurTcp.ls.remove(s);
                    s.close();
            }
        }
    }

        }
        catch (IOException e){
            e.printStackTrace();
        }



        
    }

    


}
