package system.controller;

import java.io.IOException;

public class SpotifyHTTP implements httptrucpascrééencore{

	public static final String BASE_URL = "https://api.spotify.com/v1/track/id";
	
	private SpotifyHTTP myHttp;
	
	public static void main(String[] args) throws Exception {

		 SpotifyHTTP myHttp = new SpotifyHTTP();

	        try {
	            System.out.println("Testing 1 - Send Http GET request");
	            myHttp.sendGet();

	            System.out.println("Testing 2 - Send Http POST request");
	            myHttp.sendPost();
	        } finally {
	        	myHttp.close();
	        }
	    }
	
	 private void close() throws IOException {
		 	myHttp.close();
	    }

	 private void sendGet() throws Exception {

	        HttpGet request = new HttpGet(BASE_URL);

/*	        try (CloseableHttpResponse response = httpClient.execute(request)) {

	            // Get HttpResponse Status
	            System.out.println(response.getStatusLine().toString());

	            HttpEntity entity = response.getEntity();
	            Header headers = entity.getContentType();
	            System.out.println(headers);

	            if (entity != null) {
	                // return it as a String
	                String result = EntityUtils.toString(entity);
	                System.out.println(result);
	            }

	        }

	    }

	    private void sendPost() throws Exception {

	        HttpPost post = new HttpPost("https://httpbin.org/post");

	        // add request parameter, form parameters
	        List<NameValuePair> urlParameters = new ArrayList<>();
	        urlParameters.add(new BasicNameValuePair("username", "abc"));
	        urlParameters.add(new BasicNameValuePair("password", "123"));
	        urlParameters.add(new BasicNameValuePair("custom", "secret"));

	        post.setEntity(new UrlEncodedFormEntity(urlParameters));

	        try (CloseableHttpClient httpClient = HttpClients.createDefault();
	             CloseableHttpResponse response = httpClient.execute(post)) {

	            System.out.println(EntityUtils.toString(response.getEntity()));
	        }

	    }

	}*/
	 
	 
	 
	 
	 

}
