package com.mealcord.order.model

import java.time.LocalDateTime

/**
 * @author bvvy
 * @date 2019/3/19
 */
class MenuRecord(
        var id: String,
        var menuId: String,
        var publishTime: LocalDateTime,
        var deadline: LocalDateTime,
        /**
         * 发布的人
         */
        var userId: String,
        /**
         * 推给的团队
         */
        var teamId: String

)
