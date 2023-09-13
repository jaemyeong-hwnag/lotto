package com.hjm.lotto.domain.user.service

import com.hjm.lotto.domain.user.dto.UserDto
import com.hjm.lotto.domain.user.entity.User
import com.hjm.lotto.domain.user.repository.UserRepository
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class UserService (
    private val userRepository: UserRepository,
    private val modelMapper: ModelMapper
) {
    fun addUser(userDto: UserDto) {
        userRepository.save(modelMapper.map(userDto, User::class.java))
    }
}