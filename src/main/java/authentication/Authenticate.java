package authentication;

import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.auth.ClientSecretBasic;
import com.nimbusds.oauth2.sdk.auth.Secret;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.token.AccessToken;
import utils.ReadProperties;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

public class Authenticate {

    ReadProperties readProperties = new ReadProperties();
    Properties properties = readProperties.readPropertiesFile("Authentication");
    private final String clientId = properties.getProperty("clientId");
    private final String clientScr = properties.getProperty("clientSecret");
    private final String scp = properties.getProperty("scope");
    private final String tkEndPointUri = properties.getProperty("tokenEndPointUri");

    public Authenticate() throws IOException {
    }
    public String getAccessToken() throws URISyntaxException, IOException, ParseException {

// Construct the client credentials grant
        AuthorizationGrant clientGrant = new ClientCredentialsGrant();

// The credentials to authenticate the client at the token endpoint
        ClientID clientID = new ClientID(clientId);
        Secret clientSecret = new Secret(clientScr);
        ClientAuthentication clientAuth = new ClientSecretBasic(clientID, clientSecret);

// The request scope for the token (may be optional)
        Scope scope = new Scope(scp);

// The token endpoint
        URI tokenEndpoint = new URI(tkEndPointUri);

// Make the token request
        TokenRequest request = new TokenRequest(tokenEndpoint, clientAuth, clientGrant, scope);

        TokenResponse response = TokenResponse.parse(request.toHTTPRequest().send());

        if (! response.indicatesSuccess()) {
            // We got an error response...
            TokenErrorResponse errorResponse = response.toErrorResponse();
        }

        AccessTokenResponse successResponse;
        successResponse = response.toSuccessResponse();

// Get the access token
        AccessToken accessToken = successResponse.getTokens().getAccessToken();
        System.out.println("The access token is: " + accessToken.toString());
        return accessToken.toString();
    }
}
