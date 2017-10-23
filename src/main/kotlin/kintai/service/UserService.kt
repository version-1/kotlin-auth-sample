package kintai.service

/**
 * Created by version1 on 2017/02/11.
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kintai.model.User
import kintai.repository.UserRepository

/**
 * DBからのデータ取得と加工を行う.
 */
@Service
open class UserService @Autowired constructor(private val userRepository: UserRepository) {

    /**
     * 全ユーザリストの取得
     * @return ユーザリスト
     */
    fun findAllUser(): MutableList<User> = userRepository.findAll()
    fun findByEmail(email:String): User = userRepository.findByEmail(email)
}