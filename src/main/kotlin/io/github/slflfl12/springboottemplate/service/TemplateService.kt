package io.github.slflfl12.springboottemplate.service

import io.github.slflfl12.springboottemplate.model.TemplateModel
import io.github.slflfl12.springboottemplate.repository.TemplateRepository
import org.springframework.stereotype.Service

@Service
interface TemplateService {

    fun getAllTemplates(): List<TemplateModel>?

    fun getTemplate(id: Int): TemplateModel?

    fun saveTemplate(templateModel: TemplateModel): TemplateModel

    fun getTemplateByName(name: String): TemplateModel?
}