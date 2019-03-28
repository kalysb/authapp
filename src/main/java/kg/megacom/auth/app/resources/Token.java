package kg.megacom.auth.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping(
        value = {"/oauth"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@Validated
public class Token {

    @Autowired
    private DefaultTokenServices tokenServices;

    @RequestMapping(method = RequestMethod.DELETE, path = "/revoke/{token}")
    @ResponseStatus(HttpStatus.OK)
    public void revokeToken(Authentication authentication, @PathVariable("token") String token) {

//        final String userToken = ((OAuth2AuthenticationDetails) authentication.getDetails()).getTokenValue();
//        System.out.println(userToken);
        tokenServices.revokeToken(token);
    }
}
