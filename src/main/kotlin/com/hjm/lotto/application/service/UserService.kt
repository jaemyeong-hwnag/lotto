package com.hjm.lotto.application.service

import com.hjm.lotto.application.dto.UserDto
import com.hjm.lotto.domain.model.User
import com.hjm.lotto.domain.repository.UserRepository
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