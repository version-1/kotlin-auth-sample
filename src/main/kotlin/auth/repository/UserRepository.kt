package auth.repository

/**
 * Created by version1 on 2017/02/11.
 */


import auth.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



/**
 * usersテーブルのRepository.
 */
@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail( email: String): User
}
