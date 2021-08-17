package me.horyu.studygithubcicd

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

@Component
@PropertySource("classpath:git.properties")
data class GitInfo(
    @Value("\${git.branch}")
    val branch: String,

    @Value("\${git.build.user.name}")
    val buildUser: String,

    @Value("\${git.build.version}")
    val buildVersion: String,

    @Value("\${git.commit.id.abbrev}")
    val commitShortId: String,

    @Value("\${git.commit.time}")
    val commitTime: String,
)
