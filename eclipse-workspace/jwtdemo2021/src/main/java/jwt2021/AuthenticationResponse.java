package jwt2021;

public class AuthenticationResponse {

	private final String jwtToken;

	public AuthenticationResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}

}