package com.hjm.lotto.domain.user.repository

import com.hjm.lotto.domain.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: UserRepositoryCustom, JpaRepository<User, Long> {
}