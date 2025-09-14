package project.games.personal.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class JwtTokenProvider {

    @Value("${security.jwt.secret}")
    private String secret;

    @Value("${security.jwt.expiration}")
    private long validityMs;


    public String createToken(String username, Collection<? extends GrantedAuthority> roles) {
        Date now = new Date();
        Date exp = new Date(now.getTime() + validityMs);

        return JWT.create()
                .withSubject(username)
                .withClaim("roles", roles.stream().map(GrantedAuthority::getAuthority).toList())
                .withIssuedAt(now)
                .withExpiresAt(exp)
                .sign(Algorithm.HMAC256(secret));
    }

    public String getUsername(String token) {
        return JWT.require(Algorithm.HMAC256(secret)).build().verify(token).getSubject();
    }
    public Long getValidityMs() {
        return validityMs;
    }
}

