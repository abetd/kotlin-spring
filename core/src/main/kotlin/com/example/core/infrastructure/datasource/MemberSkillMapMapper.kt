package com.example.core.infrastructure.datasource

import com.example.core.domain.model.SkillMap
import org.apache.ibatis.annotations.Mapper

@Mapper
interface MemberSkillMapMapper {

    fun findAll(): List<SkillMap>
}