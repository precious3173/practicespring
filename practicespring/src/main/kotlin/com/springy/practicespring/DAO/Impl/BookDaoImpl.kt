package com.springy.practicespring.DAO.Impl

import com.springy.practicespring.DAO.BookDao
import org.springframework.jdbc.core.JdbcTemplate

class BookDaoImpl (jdbcTemplate: JdbcTemplate) : BookDao {

    val jdbcTemplate: JdbcTemplate?  = jdbcTemplate

}