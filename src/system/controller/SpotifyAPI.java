package system.controller;

//import com.google.gson.JsonElement;
import java.util.stream.Stream.Builder;
import java.net.URI;
import java.text.ParseException;
import java.util.logging.Logger;


public class SpotifyAPI {

	  public static final String AUTHENTIFICATION = "accounts.spotify.com";
	  public static final String BASE_URL = "https://api.spotify.com/v1/track/id";
	  public static final int PORT_HTTPS = 443;
	  public static final String SCHEME = "https";
	  
	  private final SpotifyHTTP spotifyHttp;
	  private final String scheme;
	  private final String host;
	  private final Integer port;
	  private final String proxyUrl;
	  private final Integer proxyPort;
	  private final Integer proxyUsername;
	  private final Integer proxyPassword;
	  private final String clientId;
//	  private final String clientSecret;
//	  private final URI redirectUri;
//	  private String accessToken;
//	  private String refreshToken;
	private Object SpotifyHTTP;
	  
	 private SpotifyAPI(){
		this.SpotifyHTTP = builder.spotifyHttp;
	    this.scheme = builder.scheme;
	    this.host = builder.host;
	    this.port = builder.port;
	    this.proxyUrl = builder.proxyUrl;
	    this.proxyPort = builder.proxyPort;
	    this.proxyUsername = builder.proxyUsername;
	    this.proxyPassword = builder.proxyPassword;
	    this.clientId = builder.clientId;
//	    this.clientSecret = builder.clientSecret;
//	    this.redirectUri = builder.redirectUri;
//	    this.accessToken = builder.accessToken;
//	    this.refreshToken = builder.refreshToken;
	 }
	 
	 public static Builder builder() {
		    return new Builder();
		  }
}

// https://developer.spotify.com/console/get-track/?id=3n3Ppam7vgaVa1iaRUc9Lp
// https://developer.spotify.com/documentation/web-api/reference/tracks/
// https://developer.spotify.com/documentation/web-api/reference/object-model/

// https://www.jmdoudoux.fr/java/dej/chap-net.htm