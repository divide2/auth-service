package com.mealcord.order.model

import java.time.LocalDateTime

/**
 * @author bvvy
 * @date 2019/3/19
 */
class Order(
        var id: String,
        var createTime: LocalDateTime,
        var userId: String
)
