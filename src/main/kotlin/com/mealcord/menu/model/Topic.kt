package com.mealcord.menu.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author bvvy
 * @date 2019/3/19
 */
@Entity
@Table(name = "m_topic")
class Topic(
        @Id
        var id: String,
        var menuId: String,
        var name: String
)