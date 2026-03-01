package adm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public HelloController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping(value = "/api/health/snowflake", method = RequestMethod.GET)
    public String testSnowflake() {
        String version = jdbcTemplate.queryForObject("SELECT CURRENT_VERSION()", String.class);
        return "Connected to Snowflake ✅ Version: " + version;
    }
}