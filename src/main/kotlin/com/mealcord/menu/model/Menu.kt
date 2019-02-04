package com.mealcord.menu.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author bvvy
 * @date 2019/3/19
 */
@Entity
@Table(name ="m_menu")
class Menu(
        @Id
        var id: String,
        var name: String,
        var userId: String,
        var createTime: LocalDateTime
)