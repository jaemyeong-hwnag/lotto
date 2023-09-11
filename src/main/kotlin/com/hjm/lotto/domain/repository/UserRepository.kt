package com.hjm.lotto.domain.repository

import com.hjm.lotto.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: UserRepositoryCustom, JpaRepository<User, Long> {
}