package com.springy.practicespring.domain

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Book {

  val isbn: String? = null
    val title: String? = null
    val authorId: Long? = null
}