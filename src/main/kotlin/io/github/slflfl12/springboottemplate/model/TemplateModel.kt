package io.github.slflfl12.springboottemplate.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TemplateModel(
        @Id
        @GeneratedValue
        val id: Int,
        val templateName: String,
        val content: String)