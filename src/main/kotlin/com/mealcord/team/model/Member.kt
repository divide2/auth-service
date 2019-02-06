package com.mealcord.team.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author bvvy
 * @date 2019/3/19
 */
@Entity
@Table(name="t_member")
class Member(
        @Id
        var id:String,
        var teamId: String,
        var userId: String,
        var identifier: String,
        var memoname: String
)