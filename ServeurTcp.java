import java.net .* ;
import java.lang .*;
import java.io.*;
import java.util .*;
public class ServeurTcp {

public static volatile List<Socket> ls=new ArrayList<>();

public static void main(String[] args){
   

    String msg="Bienvenue";
    byte [] data=msg.getBytes();

try {   
    ServerSocket server=new ServerSocket(2022);
    while(true){
    Socket s= server.accept();
    ls.add(s);
    new ThreadTcp(s).start();
    OutputStream os= s.getOutputStream();
    os.write(data);
    }

}
catch(Exception e){
    e.printStackTrace();
  
}

}







}




   






