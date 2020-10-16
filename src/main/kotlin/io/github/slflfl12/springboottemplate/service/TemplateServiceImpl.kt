package io.github.slflfl12.springboottemplate.service

import io.github.slflfl12.springboottemplate.model.TemplateModel
import io.github.slflfl12.springboottemplate.repository.TemplateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class TemplateServiceImpl constructor(@Autowired private val templateRepository: TemplateRepository) : TemplateService {

    override fun getAllTemplates(): List<TemplateModel>? =
            templateRepository.findAllBy()

    override fun getTemplate(id: Int): TemplateModel? =
            templateRepository.findById(id).orElse(null)

    override fun getTemplateByName(name: String): TemplateModel? {
        return templateRepository.findByTemplateName(name)
    }

    @Transactional
    override fun saveTemplate(templateModel: TemplateModel): TemplateModel =
            templateRepository.save(templateModel)

}