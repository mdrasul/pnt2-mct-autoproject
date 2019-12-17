package mct.util;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class LinkTest {
	public static void linkWorks(String Url, String Title) throws ClientProtocolException, IOException {
    		
    	 HttpClient client = HttpClientBuilder.create().build();
    	 HttpGet request = new HttpGet(Url);
    	 HttpResponse response = client.execute(request);
    	
    	 //Response code generates in to readlin() through Input strream.
    	 
    	 BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
    	 String line ="";
    	 StringBuffer sb = new StringBuffer();
    	 while((line = br.readLine())!=null){
    		 sb.append(line);
    	 }
    	 
    	 
    	// System.out.println(response.getStatusLine());
    	 //System.out.print(sb);
    	 DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss,a");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			
			
			//PrintWriter saves a file in the folder 
    	 PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/fahim/Desktop/MCT_Finle/pnt2-mct-autoproject/src/test/resources/RequestResponseMctFooterRS(Code).jSon",true));
    	 pw.write("\nDate: "+ dateFormat.format(date)+"\nLink: \n"+ 
    			 	Url +"\nStatus Code: \n"+ 
    			 	response.getStatusLine().toString()+
    			 	"\n"+Title);
    	 System.out.println("Link is :" + 
    			 	response.getProtocolVersion()+
    			 	"\n The code is: "+
    			 	response.getStatusLine().getStatusCode());
     	pw.close();
      	 pw.flush();
      	 System.out.println("\n\n\n\n");
      	 
}

}