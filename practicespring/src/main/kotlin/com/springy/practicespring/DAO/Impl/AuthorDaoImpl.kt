package com.springy.practicespring.DAO.Impl

import com.springy.practicespring.DAO.AuthorDao
import org.springframework.jdbc.core.JdbcTemplate

class AuthorDaoImpl(jdbcTemplate: JdbcTemplate) : AuthorDao {
    var jdbcTemplate: JdbcTemplate? = jdbcTemplate

}