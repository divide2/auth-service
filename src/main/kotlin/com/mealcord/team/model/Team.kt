package com.mealcord.team.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author bvvy
 * @date 2019/3/19
 */
@Entity
@Table(name ="t_team")
class Team(
        @Id
        var id: String,
        var name: String,
        var avatar: String
)