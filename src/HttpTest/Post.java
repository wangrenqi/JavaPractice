package HttpTest;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Mccree on 26/11/2016.
 */
public class Post {


    private void sendPost() throws Exception {
        String urlString  = "http://192.168.56.101:9000";
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");

    }


//    public class PostReqEx {
//
//        public void sendReq(String url,String email,String fname){
//            HttpClient httpClient = HttpClients.createDefault();
//            PostMethod postMethod = new PostMethod(url);
//            postMethod.addParameter("Email", email);
//            postMethod.addParameter("fname", fname);
//            try {
//                httpClient.executeMethod(postMethod);
//            } catch (HttpException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            if (postMethod.getStatusCode() == HttpStatus.SC_OK) {
//                String resp = postMethod.getResponseBodyAsString();
//            } else {
//                //...postMethod.getStatusLine();
//            }
//        }
//    }


    // HTTP POST request
//    private void sendPost() throws Exception {
//
//        String url = "https://selfsolve.apple.com/wcResults.do";
//        URL obj = new URL(url);
//        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
//
//        //add reuqest header
//        con.setRequestMethod("POST");
//        con.setRequestProperty("User-Agent", USER_AGENT);
//        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
//
//        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
//
//        // Send post request
//        con.setDoOutput(true);
//        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//        wr.writeBytes(urlParameters);
//        wr.flush();
//        wr.close();
//
//        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'POST' request to URL : " + url);
//        System.out.println("Post parameters : " + urlParameters);
//        System.out.println("Response Code : " + responseCode);
//
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(con.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();

    }


