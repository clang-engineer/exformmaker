package com.clangengineer.exformmaker.service

import com.clangengineer.exformmaker.repository.FieldRepository
import com.clangengineer.exformmaker.service.dto.FieldDTO
import com.clangengineer.exformmaker.service.mapper.FieldMapper
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional
class FieldService(
    private val fieldRepository: FieldRepository,
    private val fieldMapper: FieldMapper,
) {

    private val log = LoggerFactory.getLogger(javaClass)

    fun save(gruopDTO: FieldDTO): FieldDTO {
        log.debug("Request to save Field : $gruopDTO")

        var gruop = fieldMapper.toEntity(gruopDTO)
        gruop = fieldRepository.save(gruop)
        return fieldMapper.toDto(gruop)
    }

    fun update(gruopDTO: FieldDTO): FieldDTO {
        log.debug("Request to update Field : {}", gruopDTO)

        var gruop = fieldMapper.toEntity(gruopDTO)
        gruop = fieldRepository.save(gruop)
        return fieldMapper.toDto(gruop)
    }

    fun partialUpdate(gruopDTO: FieldDTO): Optional<FieldDTO> {
        log.debug("Request to partially update Field : {}", gruopDTO)

        return fieldRepository.findById(gruopDTO.id)
            .map {
                fieldMapper.partialUpdate(it, gruopDTO)
                it
            }
            .map { fieldRepository.save(it) }
            .map { fieldMapper.toDto(it) }
    }

    @Transactional(readOnly = true)
    fun findAll(pageable: Pageable): Page<FieldDTO> {
        log.debug("Request to get all Fields")

        return fieldRepository.findAll(pageable)
            .map(fieldMapper::toDto)
    }

    @Transactional(readOnly = true)
    fun findAllWithEagerRelationships(pageable: Pageable) =
        fieldRepository.findAllWithToOneRelationships(pageable).map(fieldMapper::toDto)

    @Transactional(readOnly = true)
    fun findOne(id: Long): Optional<FieldDTO> {
        log.debug("Request to get Field : $id")

        return fieldRepository.findOneWithToOneRelationships(id)
            .map(fieldMapper::toDto)
    }

    fun delete(id: Long) {
        log.debug("Request to delete Field : $id")

        fieldRepository.deleteById(id)
    }
}