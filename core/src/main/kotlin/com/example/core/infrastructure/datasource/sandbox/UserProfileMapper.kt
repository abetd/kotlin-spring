package com.example.core.infrastructure.datasource.sandbox

import com.example.core.domain.model.sandbox.UserProfile
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface UserProfileMapper {

    @Select("""
        SELECT
            user_id, last_name, first_name, last_name_kana, first_name_kana, gender, telephone_number, birth_date
        FROM
            user_profiles
        WHERE
            user_id = #{id}
    """)
    fun select(id: Int): UserProfile
}