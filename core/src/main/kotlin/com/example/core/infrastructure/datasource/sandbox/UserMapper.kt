package com.example.core.infrastructure.datasource.sandbox

import com.example.core.domain.model.sandbox.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {

    // TODO テストケース（サンプルとして）
    @Select("""
        SELECT
            id, name
        FROM
            users
        WHERE
            id = #{id}
    """)
    fun select(id: Int): User
}