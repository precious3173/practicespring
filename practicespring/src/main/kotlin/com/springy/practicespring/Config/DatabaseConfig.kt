package com.springy.practicespring.Config

import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

@Configuration
class DatabaseConfig {

    fun jdbcTemplate(dataSource: DataSource): JdbcTemplate{

        return JdbcTemplate(dataSource)
    }
}