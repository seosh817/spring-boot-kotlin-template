package io.github.slflfl12.springboottemplate.repository

import io.github.slflfl12.springboottemplate.model.TemplateModel
import org.springframework.data.repository.CrudRepository

interface TemplateRepository: CrudRepository<TemplateModel,Int> {

    fun findByTemplateName(templateName: String): TemplateModel?

    fun findAllBy(): List<TemplateModel>?

}