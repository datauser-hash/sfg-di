package guru.springframework.sfgdi.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FakeDatasource {

    @Value("${datauser.username}")
    private String username;

    @Value("${datauser.password}")
    private String password;

    @Value("${datauser.jdbcurl}")
    private String jdbcUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
