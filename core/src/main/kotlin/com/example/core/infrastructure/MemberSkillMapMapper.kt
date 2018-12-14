package com.example.core.infrastructure

import com.example.core.model.SkillMap
import org.apache.ibatis.annotations.Mapper

@Mapper
interface MemberSkillMapMapper {

    fun findAll(): List<SkillMap>
}