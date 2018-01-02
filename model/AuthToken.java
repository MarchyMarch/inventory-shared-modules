package submodules.model;

import java.util.UUID;

public class AuthToken
{
    private final String authToken;

    AuthToken()
    {
        this.authToken = UUID.randomUUID().toString();
    }

    public String getToken()
    {
        return authToken;
    }
}
