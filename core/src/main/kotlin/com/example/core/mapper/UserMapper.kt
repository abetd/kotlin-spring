package com.example.core.mapper

import com.example.core.model.User
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