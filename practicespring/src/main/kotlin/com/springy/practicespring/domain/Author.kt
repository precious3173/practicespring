package com.springy.practicespring.domain

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Author {

    val id: Long? = null
    val name: String? = null
    val age: Int? = null

}