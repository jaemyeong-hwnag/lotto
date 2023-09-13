package com.hjm.lotto.domain.user.entity

import com.hjm.lotto.common.UseYn
import jakarta.persistence.*
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import java.util.Date

@Table(name = "user")
@Entity(name = "user")
@DynamicUpdate
@DynamicInsert
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    val userId: Long,
    @Column(name = "use_yn", nullable = false)
    val nae: String,
    @Column(name = "use_yn", nullable = false)
    val account: String,
    @Column(name = "use_yn", nullable = true)
    val useYn: UseYn,
    @Column(name = "create_at", nullable = true)
    val createAt: Date,
    @Column(name = "update_at", nullable = true)
    val updateAt: Date,
)